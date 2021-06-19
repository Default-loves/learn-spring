package com.junyi.entity;

import java.util.Date;

/**
 * @time: 2021/5/27 14:31
 * @version: 1.0
 * @author: junyi Xu
 * @description:
 */
public class OrderVO extends Order{
    private Date createDate;
    private String info;

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
}
