package br.univille.singleton;

public class Client {
    public static void main(String[] args) {
        var secret = "senha legal";

        var singleton = Singleton.getInstance();
        singleton.setSecret(secret);

        System.out.println(Singleton.getInstance().getSecret());
    }
}
