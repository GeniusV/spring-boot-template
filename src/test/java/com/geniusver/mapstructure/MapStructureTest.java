package com.geniusver.mapstructure;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

/**
 * MapStructureTest
 *
 * @author GeniusV
 */
public class MapStructureTest {

    @Test
    void orderToOrderDto() {
        Order order = new Order();
        order.setId(1);
        order.setOrderStatus(OrderStatus.EFFECTIVE);
        order.setName("test order name");

        OrderDTO orderDTO = OrderMapper.INSTANCE.orderToOrderDto(order);
        System.out.println(orderDTO);
    }

    @Test
    void orderDtoToOrder() {
        OrderDTO orderDTO = new OrderDTO();
        orderDTO.setOrderStatus(1L);
        orderDTO.setName("tetse");
        orderDTO.setPrice(new BigDecimal("1.00"));

        Order order = OrderMapper.INSTANCE.orderDtoToOrder(orderDTO);
        System.out.println(order);
    }
}
