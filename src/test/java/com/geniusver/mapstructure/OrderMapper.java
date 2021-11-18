package com.geniusver.mapstructure;

import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.factory.Mappers;

/**
 * OrderMapper
 *
 * @author GeniusV
 */
@Mapper
public abstract class OrderMapper {

    public static OrderMapper INSTANCE = Mappers.getMapper(OrderMapper.class);

    public abstract OrderDTO orderToOrderDto(Order order);

    public abstract Order orderDtoToOrder(OrderDTO orderDTO);

    public abstract void copyOrderToOrderDto(Order order, @MappingTarget OrderDTO orderDTO);

    protected Long orderStatusToLong(OrderStatus status) {
        return status.value;
    }

    protected OrderStatus longToOrderStatus(long value) {
        if (value == 1) {
            return OrderStatus.EFFECTIVE;
        } else if (value == 0) {
            return OrderStatus.DELETED;
        }

        throw new IllegalArgumentException("no such order status for " + value);
    }
}
