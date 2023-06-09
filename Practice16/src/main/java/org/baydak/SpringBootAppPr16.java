package org.baydak;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// Создать связь один-ко-многим между сущностями из предыдущего задания и
// проверить работу lazy loading.
@SpringBootApplication
public class SpringBootAppPr16 {
    public static void main(String[] args) {
        SpringApplication.run(SpringBootAppPr16.class);
    }
}