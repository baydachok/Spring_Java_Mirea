package org.baydak;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


/*
Создать файл application.yml в папке resources, добавить в него такие свойства:
student.name – имя студента;
student.last_name – фамилия студента;
student.group – название группы студента.
При запуске приложения выведите данные свойства в консоль при помощи интерфейса Environment или аннотации Value.
* */
@SpringBootApplication
public class SpringBootAppPr13 {
    public static void main(String[] args) {
        SpringApplication.run(SpringBootAppPr13.class);
    }
}