package com.dev.product_service_api_2.service;

import com.dev.product_service_api_2.dto.request.RequestProductDto;
import com.dev.product_service_api_2.dto.response.ResponseProductDto;
import com.dev.product_service_api_2.dto.response.paginator.ResponseProductPaginatorDto;

public interface ProductService {

    public void create(RequestProductDto requestProductDto);
    public void delete(String id);
    public void update(String id, RequestProductDto requestProductDto);
    public ResponseProductDto findById(String id);
    public ResponseProductPaginatorDto findAll(String searchText, int page, int size);

}
