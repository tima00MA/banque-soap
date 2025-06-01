package net.tima;


import proxy.BanqueService;
import proxy.BanqueWS;
import proxy.Compte;

public class Main {
    public static void main(String[] args) {
        BanqueService proxy = new BanqueWS().getBanqueServicePort();
        System.out.println(proxy.conversionEuroToDH(90));
        Compte compte =proxy.getCompte(4);
        System.out.println("--------------------------");
        System.out.println(compte.getCode());
        System.out.println(compte.getSolde());
        System.out.println(compte.getDateCreation());

        proxy.listComptes().forEach(cp -> {
            System.out.println("---------------");
            System.out.println(compte.getCode());
            System.out.println(compte.getSolde());
            System.out.println(compte.getDateCreation());
        });



    }
}