package com.codetato.daggermvp.ui.main;

import com.codetato.daggermvp.repository.PotatoRepository;

import dagger.Module;
import dagger.Provides;

@Module
public class MainActivityModule {

    @Provides
    MainContract.View provideMainView(MainActivity mainActivity){
        return mainActivity;
    }

    @Provides
    MainContract.Presenter provideMainPresenter(MainContract.View mainView, PotatoRepository potatoRepository){
        return new MainPresenter(mainView, potatoRepository);
    }
}