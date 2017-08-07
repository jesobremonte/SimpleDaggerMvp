package com.codetato.daggermvp.di;

import com.codetato.daggermvp.repository.PotatoRepositoryModule;
import com.codetato.daggermvp.ui.main.MainActivity;
import com.codetato.daggermvp.ui.main.MainActivityModule;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
public abstract class ActivityBuilder {

    @ContributesAndroidInjector(modules = {
            MainActivityModule.class,
            PotatoRepositoryModule.class
    })
    abstract MainActivity bindMainActivity();

}
