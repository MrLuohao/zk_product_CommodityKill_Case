package mapper;

import models.Order;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

/**
 * @Title: OrderMapper
 * @Author Mr.罗
 * @Package mapper
 * @Date 2023/6/12 17:40
 * @description: 订单接口
 */
@Mapper
@Component
public interface OrderMapper {
    //添加订单
    @Insert("INSERT INTO `order`(id,pid,userid) VALUES (#{id},#{pid},#{userid})")
    int insert(Order order);
}
