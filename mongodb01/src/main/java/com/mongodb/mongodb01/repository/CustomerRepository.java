package com.mongodb.mongodb01.repository;

import com.mongodb.mongodb01.entity.Customer;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * <B>作者：</B>kobe<BR>
 * <B>时间：</B>2017/09/28/ 23:53 星期四<BR>
 * <p>
 * <B>系统名称：</B>springbootq<BR>
 * <B>概要说明：</B>springbootq<BR>
 */
@Repository
public interface CustomerRepository extends MongoRepository<Customer, String> {

    // *************
    // 注：这晨风的 findByXxx 必须要和 你的javaBean 属性要一样，不是就会有 注入异常。它找不到。
    Customer findByAge(String age);

    List<Customer> findByName(String name);
}
