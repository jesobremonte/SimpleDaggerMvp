package com.codetato.daggermvp.repository.remote;

import dagger.Module;
import dagger.Provides;

@Module
public class WebServiceModule {

    @Provides
    WebService providesWebService() {
        return new WebServiceImpl();
    }

}