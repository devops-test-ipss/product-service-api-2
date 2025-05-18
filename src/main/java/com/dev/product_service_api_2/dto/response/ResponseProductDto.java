package com.dev.product_service_api_2.dto.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ResponseProductDto {
    private String description;
    private double unitePrice;
    private int qtyOnHand;
}
