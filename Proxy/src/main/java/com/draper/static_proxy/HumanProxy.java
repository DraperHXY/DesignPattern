package com.draper.static_proxy;

import com.draper.Human;

public class HumanProxy implements Human {

    private Human human;

    public HumanProxy(Human human) {
        this.human = human;
    }

    public void eat() {
        // doSomething
        human.eat();
        // doSomething
    }

}
