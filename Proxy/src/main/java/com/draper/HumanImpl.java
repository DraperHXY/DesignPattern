package com.draper;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class HumanImpl implements Human{

    public void eat() {
        log.info("I'm eating now");
    }

}
