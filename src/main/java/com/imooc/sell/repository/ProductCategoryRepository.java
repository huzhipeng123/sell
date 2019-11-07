package com.imooc.sell.repository;

import com.imooc.sell.dataobject.ProductCategory;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @Author huzhpm
 * @Date 2019/11/7 23:44
 * @Version 1.0
 * @Content
 */
public interface ProductCategoryRepository extends JpaRepository<ProductCategory, Integer> {

}
