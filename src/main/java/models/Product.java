package models;

import java.io.Serializable;

/**
 * @Title: product
 * @Author Mr.罗
 * @Package models
 * @Date 2023/6/12 17:41
 * @description: 商品表实体类
 */
public class Product implements Serializable {
    private int id;
    private String product_name;
    private int stock;
    private int version;

    public Product() {
    }

    public Product(int id, String product_name, int stock, int version) {
        this.id = id;
        this.product_name = product_name;
        this.stock = stock;
        this.version = version;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProduct_name() {
        return product_name;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", product_name='" + product_name + '\'' +
                ", stock=" + stock +
                ", version=" + version +
                '}';
    }
}
