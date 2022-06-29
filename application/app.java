package application;

import entities.FabricaDeCarros;
import entities.MontadoraChevrolet;
import entities.MontadoraVolkswagen;

import java.util.Scanner;

public class app {

    private static FabricaDeCarros fabricaDeCarros;

    public static void main(String[] args) {
        var sc = new Scanner(System.in);

        System.out.println("Digite qual montadora voce deseja montar o carro Volkswagen ou Chevrolet");
        var montadoraCarro = sc.next();
        if(montadoraCarro.equalsIgnoreCase("Volkswagen")){
            fabricaDeCarros = new MontadoraVolkswagen();
        }
        else if(montadoraCarro.equalsIgnoreCase("Chevrolet")){
            fabricaDeCarros = new MontadoraChevrolet();
        }
        System.out.println(fabricaDeCarros.criaCarro().montadora());
        System.out.println(fabricaDeCarros.criaCarro().modelo());
        System.out.println(fabricaDeCarros.criaCarro().cor());
        System.out.println(fabricaDeCarros.criaCarro().cavalosDePotencia());

    }
}




