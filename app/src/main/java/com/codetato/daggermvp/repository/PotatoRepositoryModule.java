package com.codetato.daggermvp.repository;

import com.codetato.daggermvp.repository.remote.WebService;
import com.codetato.daggermvp.repository.remote.WebServiceModule;

import dagger.Module;
import dagger.Provides;

@Module(includes = WebServiceModule.class)
public class PotatoRepositoryModule {

    @Provides
    PotatoRepository providesPotatoRepository(WebService webService) {
        return new PotatoRepositoryImpl(webService);
    }

}