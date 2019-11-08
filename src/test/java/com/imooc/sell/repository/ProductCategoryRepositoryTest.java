package com.imooc.sell.repository;

import com.imooc.sell.dataobject.ProductCategory;
import org.hibernate.annotations.DynamicUpdate;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Optional;


/**
 * @Author huzhpm
 * @Date 2019/11/7 23:44
 * @Version 1.0
 * @Content
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@DynamicUpdate
public class ProductCategoryRepositoryTest {
    @Autowired
    private ProductCategoryRepository repository;

    @Test
    public void findOneTest(){
        Optional<ProductCategory> productCategory = repository.findById(1);
        System.out.println(productCategory.toString());
    }

    @Test
    public void saveTest(){
//        ProductCategory productCategory = new ProductCategory();
//        productCategory.setCategoryName("女生最爱");
//        productCategory.setCategoryType(4);
//        repository.save(productCategory);
        ProductCategory productCategory = new ProductCategory("老人最爱",8);
        ProductCategory result = repository.save(productCategory);
        Assert.assertNotNull(result);
        result.setCategoryType(5);
        ProductCategory result1 = repository.save(productCategory);
        Assert.assertNotNull(result1);
    }

    @Test
    public void updateTest(){
        ProductCategory productCategory = new ProductCategory();
        productCategory.setCategoryName("男生最爱");
        productCategory.setCategoryType(3);
        productCategory.setCategoryId(3);
        repository.save(productCategory);
    }
}