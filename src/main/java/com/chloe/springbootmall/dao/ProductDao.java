package com.chloe.springbootmall.dao;

import com.chloe.springbootmall.model.Product;

public interface ProductDao {

    Product getProductById(Integer productId);
}
