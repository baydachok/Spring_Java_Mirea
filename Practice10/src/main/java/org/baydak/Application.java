package org.baydak;

import org.baydak.beans.Drummer;
import org.baydak.beans.Guitarist;
import org.baydak.beans.Trombonist;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(BeanConfiguration.class);

        Guitarist guitarist = context.getBean(Guitarist.class);
        guitarist.doСode();

        Drummer drummer = context.getBean("drummer", Drummer.class);
        drummer.doСode();

        Trombonist trombonist = context.getBean("trombonist", Trombonist.class);
        trombonist.doСode();
    }
}
