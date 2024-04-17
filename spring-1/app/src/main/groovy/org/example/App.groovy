/*
 * This Groovy source file was generated by the Gradle 'init' task.
 */
package org.example

import org.apache.catalina.core.ApplicationContext
import org.example.bean.UserConfig
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.context.support.ClassPathXmlApplicationContext

@SpringBootApplication
class App {
    static void main(String[] args) {
        SpringApplication.run(App.class,args)
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml")
        UserConfig config = (UserConfig) context.getBean("userConfigBean")
    }
}
