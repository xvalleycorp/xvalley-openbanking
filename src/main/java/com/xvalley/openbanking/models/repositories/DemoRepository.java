package com.xvalley.openbanking.models.repositories;

import java.util.Random;

public class DemoRepository implements IDemoRepository{

    @Override
    public Integer GetRandomNumber() {
        return new Random().nextInt();
    }
}
