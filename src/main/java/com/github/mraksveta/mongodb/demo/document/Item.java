package com.github.mraksveta.mongodb.demo.document;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter
@NoArgsConstructor @AllArgsConstructor
public class Item {
    private Long id;
    private Order order;
    private String product;
    private double price;
    private int quantity;
}
