package org.baydak;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


/*
Для приложения из предыдущего задания пометить все классы сервисов,
в которых происходит взаимодействие с базой данных, как Transactional.
Добавить отправку информации о сохранении каждого объекта по электронной почте,
создав отдельный класс EmailService с асинхронными методами отправки сообщений.
Для асинхронности методов используйте аннотацию Async.
* */
@SpringBootApplication
public class SpringBootAppPr21 {
    public static void main(String[] args) {
        SpringApplication.run(SpringBootAppPr21.class);
    }
}