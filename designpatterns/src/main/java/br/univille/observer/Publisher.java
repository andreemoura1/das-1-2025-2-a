package br.univille.observer;

import java.util.ArrayList;

public class Publisher {

    // private Subscriber[] subscribers = new Subscriber[10];
    private ArrayList<Subscriber> subscribers = new ArrayList<>();
    private String mainState;

    public String getMainState() {
        return mainState;
    }

    public void setMainState(String mainState) {
        this.mainState = mainState;
    }

    // Adicionando um subscriber na lista de assinantes
    public void subscribe(Subscriber s) {
        subscribers.add(s);
    }

    // Notificando todos os assinantes
    public void notifySubscribers() {
        for (Subscriber s : subscribers) {
            s.update(mainState);
        }
    }
}
