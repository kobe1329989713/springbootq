package com.springboot01.springboot01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @SpringBootApplication 这个注释有下面这个三个注解作用，因为它都有了。
 *
 * @SpringBootConfiguration  这个注解 就是相当于是 springMVC 里面xml 文件样。
 * @EnableAutoConfiguration 自动 ，自动配置。
 * @ComponentScan  一个扫包的，扫描这个类下面的 子包，包括当前目录
 */
@SpringBootApplication
public class Springboot01Application {

	public static void main(String[] args) {
//		SpringApplication.run(Springboot01Application.class, args);


        // 也是上面 哪个运行方法。得到这个 app 对象，这个app 里面有很多api 方法，就可以设置
        SpringApplication app=new SpringApplication(Springboot01Application.class);
        // 命令行 在运行时，就不能访问了。增加安全性。
		app.setAddCommandLineProperties(false);
        app.run(args);



	  /* SpringApplication app = new SpringApplication(Springboot01Application.class);
		app.setAddCommandLineProperties(false);
		app.run(args);*/

	}
}
