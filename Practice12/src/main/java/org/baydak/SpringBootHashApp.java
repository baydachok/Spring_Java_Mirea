package org.baydak;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



/*
Создать приложение, которое при запуске берет данные из одного файла,
хеширует, а при остановке приложения удаляет исходный файл,
оставляя только файл с захешированными данными. Названия первого и второго файла
передаются в качестве аргументов при запуске (решил сделать немного по другому(чтобы было интереснее,
ибо почему бы и нет).  При отсутствии первого файла создает второй файл и записывает в него строку null.
Реализовать с использованием аннотаций PostConstruct, PreDestroy.
* */
@SpringBootApplication
public class SpringBootHashApp{
    public static void main(String[] args) {
        SpringApplication.run(SpringBootHashApp.class, args);
    }
}