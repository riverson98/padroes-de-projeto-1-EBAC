package entities;


import repository.CriaCarro;

public class Chevrolet implements CriaCarro {


    public String montadora() {
        return "Montadora: Chevrolet";
    }


    public String modelo() {
        return "Carro: onix ano de 2022";
    }


    public String cor() {
        return "Cor: Preto fosco";
    }


    public String cavalosDePotencia() {
       return "Cavalos: 150HP";
    }


}

