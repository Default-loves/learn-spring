package com.junyi;

import com.junyi.entity.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.PostConstruct;
import java.util.List;

/**
 * @time: 2021/4/13 9:40
 * @version: 1.0
 * @author: junyi Xu
 * @description:
 */
@RestController
@RequestMapping("/order")
public class OrderController {


    @Autowired
    OrderRepository orderRepository;

    @GetMapping("/getOne")
    public Order getOne() {
        return orderRepository.findById(1).get();
    }

    @GetMapping("/getAll")
    public List<Order> getAll() {
        return orderRepository.findAll();
    }

    @GetMapping("/{id}")
    public Order getById(@PathVariable("id") Integer id) {
        return  orderRepository.findById(id).get();
    }

    @PostMapping("/save")
    public String save(Order order) {
        orderRepository.save(order);
        return "save success";
    }
}
