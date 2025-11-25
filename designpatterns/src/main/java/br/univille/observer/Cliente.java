package br.univille.observer;

public class Cliente {
    public static void main(String[] args) {
        var grupoFamilia = new Publisher();
        
        var p1 = new ConcreteSubscriber();
        var p2 = new ConcreteSubscriber();
        var p3 = new ConcreteSubscriber();
    
        grupoFamilia.subscribe(p1);
        grupoFamilia.subscribe(p2);
        grupoFamilia.subscribe(p3);

        grupoFamilia.setMainState("BOM DIAA");
        grupoFamilia.notifySubscribers();
    }
}
