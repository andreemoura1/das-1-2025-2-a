package br.univille.singleton;

public class Singleton {
    //variavel global
    private static Singleton instance;
    private String secret;

    public String getSecret() {
        return secret;
    }

    public void setSecret(String secret) {
        this.secret = secret;
    }

    private Singleton(){
        System.out.println("Construtor do Singleton...");
    }

    public static Singleton getInstance(){
        System.out.println("getInstance...");
        
        if(instance == null){
            System.out.println("new Singleton...");
            instance = new Singleton();
        }
        return instance;
    }
}
