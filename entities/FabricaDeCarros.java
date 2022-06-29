package entities;

import repository.CriaCarro;

public abstract class FabricaDeCarros {
    CriaCarro criaCarro = criaCarro();



    public abstract CriaCarro criaCarro();

    @Override
    public String toString() {
        return "FabricaDeCarros{" +
                "criaCarro=" + criaCarro +
                '}';
    }
}
