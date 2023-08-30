package com.scaler.lld.questions;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class Invoice {
    private Book book;
    private Integer quantity;
    private Double discountRate;
    private Double taxRate;

    @Getter(AccessLevel.NONE)
    private double total; // Will not generate a getter

    public Double getTotal() {
        double price = ((book.getPrice() - book.getPrice() * discountRate) * this.quantity);
        return price * (1 + taxRate);
    }
}
