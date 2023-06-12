package service;

import org.springframework.stereotype.Service;

/**
 * @Title: ProductService
 * @Author Mr.罗
 * @Package service
 * @Date 2023/6/12 17:42
 * @description: 商品服务
 */
@Service
public interface ProductService {

    //减库存
    void reduceStock(int id) throws Exception;
}
