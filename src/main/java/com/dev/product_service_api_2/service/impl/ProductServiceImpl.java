package com.dev.product_service_api_2.service.impl;

import com.dev.product_service_api_2.dto.request.RequestProductDto;
import com.dev.product_service_api_2.dto.response.ResponseProductDto;
import com.dev.product_service_api_2.dto.response.paginator.ResponseProductPaginatorDto;
import com.dev.product_service_api_2.service.ProductService;

public class ProductServiceImpl implements ProductService {

    @Override
    public void create(RequestProductDto requestProductDto) {

    }

    @Override
    public void delete(String id) {

    }

    @Override
    public void update(String id, RequestProductDto requestProductDto) {

    }

    @Override
    public ResponseProductDto findById(String id) {
        return null;
    }

    @Override
    public ResponseProductPaginatorDto findAll(String searchText, int page, int size) {
        return null;
    }
}
