package service.impl;

import mapper.OrderMapper;
import mapper.ProductMapper;
import models.Order;
import models.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import service.ProductService;

import java.util.UUID;

/**
 * @Title: ProductServiceImpl
 * @Author Mr.罗
 * @Package service
 * @Date 2023/6/12 17:43
 * @description: 服务实现类
 */
@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductMapper productMapper;
    @Autowired
    private OrderMapper orderMapper;

    @Override
    public void reduceStock(int id) throws Exception {
        //1.获取库存（根据商品id查询商品）
        Product product = productMapper.getProduct(id);
        if (product.getStock() <= 0) {
            throw new RuntimeException("已抢光！");
        }
        //2.减库存
        int i = productMapper.reduceStock(id);
        if (i == 1) {
            //3.生成订单(使用uuid工具帮我们生成一个订单号)
            Order order = new Order(UUID.randomUUID().toString(), id, 101);
            orderMapper.insert(order);
        }else {
            throw new RuntimeException("减库存失败！");
        }
    }
}
