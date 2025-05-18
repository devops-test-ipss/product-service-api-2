package com.dev.product_service_api_2.dto.request.paginator;

import com.dev.product_service_api_2.dto.response.ResponseProductDto;

import java.util.List;

public class RequestProductPaginatorDto {

    private long count;
    private List<ResponseProductDto> dataList;

}
