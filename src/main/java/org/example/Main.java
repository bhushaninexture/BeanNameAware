package org.example;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("app-conf.xml");
        Book book = (Book)context.getBean("myBook");
        System.out.println("Book Name:" + book.getBookName());
        context.close();
    }
}