package com.imooc.sell.repository;

import com.imooc.sell.dataobject.ProductCategory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @Author huzhpm
 * @Date 2019/11/7 23:44
 * @Version 1.0
 * @Content
 */
@RunWith(SpringRunner.class)
public class ProductCategoryRepositoryTest {
    @Autowired
    private ProductCategoryRepository repository;

    @Test
    public void findOneTest(){
        Optional<ProductCategory> productCategory = repository.findById(1);
        System.out.println(productCategory.toString());
    }
}