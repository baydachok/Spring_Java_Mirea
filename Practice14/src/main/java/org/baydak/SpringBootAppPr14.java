package org.baydak;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
/*
Создать простой html-документ, который будет содержать вашу фамилию, имя, номер группы, номер варианта.
Создать контроллер, который будет возвращать данный статический документ при переходе на url «/home».
Выполнить задание в зависимости с вариантом индивидуального задания.

Задание варианта:

Создать класс Game с полями name, creationDate.
Создать класс GameAuthor с полями nickname, birthDate.
Создать классы-контроллеры для создания, удаления объектов и получения всех объектов каждого типа.
Сами объекты хранить в памяти.
*/
@SpringBootApplication
public class SpringBootAppPr14 {
    public static void main(String[] args) {
        SpringApplication.run(SpringBootAppPr14.class);
    }
}