package com.xvalley.openbanking.models.persistence;

import com.xvalley.openbanking.models.repositories.DemoRepository;
import com.xvalley.openbanking.models.repositories.IDemoRepository;

public class DemoPersistence implements IPersistence{

    @Override
    public IDemoRepository GetDemoRepository() {
        return new DemoRepository();
    }
}
