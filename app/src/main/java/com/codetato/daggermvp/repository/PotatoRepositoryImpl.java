package com.codetato.daggermvp.repository;

import com.codetato.daggermvp.repository.remote.WebService;

import javax.inject.Inject;

public class PotatoRepositoryImpl implements PotatoRepository {

    private final WebService webService;

    @Inject
    PotatoRepositoryImpl(WebService webService) {
        this.webService = webService;
    }

    @Override
    public String getPotato() {
        return webService.fetchPotato();
    }
}
