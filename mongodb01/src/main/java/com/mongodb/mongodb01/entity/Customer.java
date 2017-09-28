package com.mongodb.mongodb01.entity;

import org.springframework.data.annotation.Id;

import org.springframework.data.annotation.Id;

/**
 * <B>作者：</B>kobe<BR>
 * <B>时间：</B>2017/09/28/ 23:45 星期四<BR>
 * <p>
 * <B>系统名称：</B>springbootq<BR>
 * <B>概要说明：</B>
 *
 * cid：该字段用于mongodb的“_id"索引
 *  1 需要	@Id的注解
 *  2定义为String类型  ，如果定义为Integer可能索引只会是0
 *  会出现key重复导致数据库插不进去的情况
 *  3该类型也是MongoRepository泛型类主键的ID
 *
 * <BR>
 */

public class Customer {

    // moggodb bean 这个必须要加，而且必须要是 String 类型，不然映射不了。
    @Id
    private String cid;
    private String name;
    private Integer age;

    public String getCid() {
        return cid;
    }

    public void setCid(String cid) {
        this.cid = cid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
