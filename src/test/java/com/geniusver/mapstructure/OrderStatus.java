package com.geniusver.mapstructure;

/**
 * OrderStatus
 *
 * @author GeniusV
 */
public enum OrderStatus {
    DELETED(0), EFFECTIVE(1);

    public final long value;

    OrderStatus(long value) {
        this.value = value;
    }
}
