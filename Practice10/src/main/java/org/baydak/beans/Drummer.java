package org.baydak.beans;

import org.springframework.stereotype.Component;

@Component
public class Drummer implements Musician {
    @Override
    public void doСode() {
        System.out.println("I'm a drummer and I play drums...");
    }
}
