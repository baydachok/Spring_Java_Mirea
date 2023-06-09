package org.baydak.beans;

import org.springframework.stereotype.Component;

@Component
public class Trombonist implements Musician {
    @Override
    public void doСode() {
        System.out.println("I'm a trombonist and I play the trombone...");
    }
}
