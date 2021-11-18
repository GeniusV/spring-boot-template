package com.geniusver.mapstructure;

import lombok.Data;

import java.math.BigDecimal;

/**
 * Order
 *
 * @author GeniusV
 */
@Data
public class Order {
    private Integer id;
    private String name;
    private BigDecimal price = BigDecimal.ZERO;
    private OrderStatus orderStatus;
}
