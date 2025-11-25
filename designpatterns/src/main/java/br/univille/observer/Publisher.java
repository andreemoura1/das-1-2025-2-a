package br.univille.observer;

import java.util.ArrayList;

public class Publisher extends ConcreteSubscriber{
    // Lista estatica, sempre vai ter tamanho 10
    // private Subscriber[] subscribers = new Subscriber[10];

    // o tamanho é o mesmo que a tua carteira
    private ArrayList<Subscriber> subscribers = new ArrayList<>();

    private String mainState;

    public void subscribe (Subscriber sub) {
        subscribers.add(sub);
    }

    public void notifySubscribers () {
        for (Subscriber umAssinante: subscribers){
            umAssinante.update(mainState);
        }
    }

    public String getMainState() {
        return mainState;
    }

    public void setMainState(String mainState) {
        this.mainState = mainState;
    }
    
}
