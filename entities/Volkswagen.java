package entities;

import repository.CriaCarro;

public class Volkswagen implements CriaCarro {


    @Override
    public String montadora() {
        return "Montadora: Volkswagen";
    }

    @Override
    public String modelo() {
        return "Carro: Gol ano de 2022";
    }

    @Override
    public String cor() {
        return "Cor: Branco gelo";
    }

    @Override
    public String cavalosDePotencia() {
        return "Cavalos: 120HP";
    }



}
