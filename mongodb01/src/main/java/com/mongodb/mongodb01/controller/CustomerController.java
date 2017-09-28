package com.mongodb.mongodb01.controller;

import com.mongodb.mongodb01.entity.Customer;
//import com.mongodb.mongodb01.repository.CustomerRepository;
import com.mongodb.mongodb01.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * <B>作者：</B>kobe<BR>
 * <B>时间：</B>2017/09/28/ 23:55 星期四<BR>
 * <p>
 * <B>系统名称：</B>springbootq<BR>
 * <B>概要说明：</B>springbootq<BR>
 */
@RestController
@RequestMapping("/customer")
public class CustomerController {

//    @Autowired
//    private CustomerRepository customerRepository;
//
//    @GetMapping("/add")
//    public Customer add(@RequestParam("name") String name) {
//        Customer c = new Customer();
//        c.setName(name);
//        return customerRepository.save(c);
//    }

}
