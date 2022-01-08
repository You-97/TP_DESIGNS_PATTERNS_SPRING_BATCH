package com.ma.assurance.app;


import com.ma.assurance.*;

public class Main {
    public static void main(String[] args) {

        Assurance assurance = new AssuranceVehicule();

        assurance = new Incendie(assurance);
        assurance = new BrisDeGlace(assurance);
        assurance = new Inondation(assurance);

        System.out.println("L'assurance du véhicule est pour frais de : " + assurance.cost() + " DH");
    }
}
