package com.codetato.daggermvp.ui.main;

import com.codetato.daggermvp.repository.PotatoRepository;

import javax.inject.Inject;

public class MainPresenter implements MainContract.Presenter {

    private final MainContract.View view;
    private final PotatoRepository potatoRepository;

    @Inject
    MainPresenter(MainContract.View view, PotatoRepository potatoRepository) {
        this.view = view;
        this.potatoRepository = potatoRepository;
    }

    @Override
    public void getPotato() {
        String thePotato = potatoRepository.getPotato();
        view.showPotato(thePotato);
    }
}
