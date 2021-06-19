package com.junyi;

import com.alibaba.fastjson.JSON;
import com.junyi.entity.Goods;
import com.junyi.entity.Order;
import com.junyi.entity.OrderVO;
import com.junyi.util.JsonUtil;
import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;

import java.util.Arrays;
import java.util.Date;

/**
 * @time: 2021/5/27 14:19
 * @version: 1.0
 * @author: junyi Xu
 * @description:
 */
public class aaa {
    public static void main(String[] args) {
        Order order = new Order();
        order.setId(3);
        order.setCustomer("xiao ming");
        Goods apple = Goods.builder().id(1).name("apple").build();
        Goods milk = Goods.builder().id(2).name("milk").build();
        order.setGoods(Arrays.asList(apple, milk));
        String result = JsonUtil.toJsonStr(order);
        System.out.println(result);

        ModelMapper modelMapper = new ModelMapper();
        modelMapper.getConfiguration().setFullTypeMatchingRequired(true);
        modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
        OrderVO vo = modelMapper.map(order, OrderVO.class);
        vo.setCreateDate(new Date());
        vo.setInfo("message info");
        System.out.println(JSON.toJSONString(vo));
        Order order2 = modelMapper.map(vo, Order.class);
        System.out.println(JSON.toJSONString(order2));
    }
}
