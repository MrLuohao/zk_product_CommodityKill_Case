package models;

import java.io.Serializable;

/**
 * @Title: order
 * @Author Mr.罗
 * @Package models
 * @Date 2023/6/12 17:41
 * @description: 订单表实体类
 */
public class Order implements Serializable {
    private String id;
    private int pid;
    private int userid;

    public Order() {
    }

    public Order(String id, int pid, int userid) {
        this.id = id;
        this.pid = pid;
        this.userid = userid;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id='" + id + '\'' +
                ", pid=" + pid +
                ", userid=" + userid +
                '}';
    }
}
