package com.geniusver.mapstructure;

import lombok.Data;

import java.math.BigDecimal;

/**
 * OrderDTO
 *
 * @author GeniusV
 */
@Data
public class OrderDTO {
    private Integer id;
    private String name;
    private BigDecimal price = BigDecimal.ZERO;
    private Long orderStatus;
}
