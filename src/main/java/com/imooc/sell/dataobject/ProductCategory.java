package com.imooc.sell.dataobject;

import org.springframework.data.annotation.Id;

import javax.persistence.GeneratedValue;

/**
 * @Author huzhpm
 * @Date 2019/11/7 23:38
 * @Version 1.0
 * @Content 类目表VO
 */
public class ProductCategory {
    /**
     * 类目id
     */
    @Id
    @GeneratedValue
    private Integer categoryId;

    /**
     * 类目名字
     */
    private String categoryname;

    /**
     * 类目编码
     */
    private Integer categoryType;

    public ProductCategory() {
    }

    public ProductCategory(Integer categoryId, String categoryname, Integer categoryType) {
        this.categoryId = categoryId;
        this.categoryname = categoryname;
        this.categoryType = categoryType;
    }

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public String getCategoryname() {
        return categoryname;
    }

    public void setCategoryname(String categoryname) {
        this.categoryname = categoryname;
    }

    public Integer getCategoryType() {
        return categoryType;
    }

    public void setCategoryType(Integer categoryType) {
        this.categoryType = categoryType;
    }
}
