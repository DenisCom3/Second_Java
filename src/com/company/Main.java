package com.company;

import com.company.list.Bird;
import com.company.list.Blackbird;
import com.company.list.Crow;

public class Main {

    public static void main(String[] args) {
        Bird[] birds = new Bird[]{
            new Crow("Crow"),
            new Blackbird("Blackbird")
            };
        birds[0].food();
        birds[1].food();
        new Main().print(birds);

        }
    private void print(Bird[] birds) {
        for (Bird bird:birds) {
            System.out.println(bird.toString());
        }
    }
}

