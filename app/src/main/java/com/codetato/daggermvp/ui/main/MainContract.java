package com.codetato.daggermvp.ui.main;

public interface MainContract {

    interface View {

        void showPotato(String potato);

    }

    interface Presenter {

        void getPotato();

    }
}
