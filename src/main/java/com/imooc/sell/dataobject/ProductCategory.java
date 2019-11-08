package com.imooc.sell.dataobject;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

/**
 * @Author huzhpm
 * @Date 2019/11/7 23:38
 * @Version 1.0
 * @Content 类目表VO
 */
@Entity
@Table(name = "product_category")
@Data
public class ProductCategory {
    /**
     * 类目id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer categoryId;

    /**
     * 类目名字
     */
    private String categoryName;

    /**
     * 类目编码
     */
    private Integer categoryType;

    private Date createTime;

    private Date updateTime;

    public ProductCategory(String categoryName, Integer categoryType) {
        this.categoryName = categoryName;
        this.categoryType = categoryType;
    }

    public ProductCategory() {
    }
}
