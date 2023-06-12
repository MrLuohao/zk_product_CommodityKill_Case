package mapper;

import models.Product;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Component;

/**
 * @Title: OrderMapper
 * @Author Mr.罗
 * @Package mapper
 * @Date 2023/6/12 17:40
 * @description: 商品接口
 */
@Mapper
@Component
public interface ProductMapper {

    //查询商品（目的是查询商品库存）
    @Select("select * from product where id = #{id}")
    Product getProduct(@Param("id") int id);

    //减库存
    @Update("update product set stock = stock-1 where id = #{id}")
    int reduceStock(@Param("id") int id);
}
