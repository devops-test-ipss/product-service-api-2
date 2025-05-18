package com.dev.product_service_api_2.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "products") // [relation database => (table,Data raw)] [non relation database => (collection, document)]
public class Product {

    @Id
    private String id;
    private String description;
    private double unitePrice;
    private int qtyOnHand;

}
