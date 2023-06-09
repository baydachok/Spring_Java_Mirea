package org.baydak;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


/*
Для приложения из предыдущего задания создать класс-сервис с методом,
который будет вызываться каждые 30 минут и очищать определённую директорию,
а затем создавать по файлу для каждой из сущностей и загружать туда все данные из базы данных.
Также добавить возможность вызывать данный метод с использованием Java Management Extensions (JMX).
* */
@SpringBootApplication
public class SpringBootAppPr22 {
    public static void main(String[] args) {
        SpringApplication.run(SpringBootAppPr22.class);
    }
}