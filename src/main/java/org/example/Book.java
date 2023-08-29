package org.example;

import org.springframework.beans.factory.BeanNameAware;

public class Book implements BeanNameAware {

    private String bookName;
    @Override
    public void setBeanName(String beanName) { //in this container set BeanName

        System.out.println(beanName +" bean has been initialized." );
    }
    public Book(String bookName) {

        this.bookName = bookName;
    }
    public String getBookName() {
        return bookName;
    }
}
