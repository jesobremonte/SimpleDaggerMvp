package com.codetato.daggermvp.repository.remote;

import javax.inject.Inject;

public class WebServiceImpl implements WebService {

    @Inject
    WebServiceImpl() {

    }

    @Override
    public String fetchPotato() {
        return System.currentTimeMillis() % 2 == 0 ? "green potato" : "brown potato";
    }
}
