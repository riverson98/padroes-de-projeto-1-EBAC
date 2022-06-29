package entities;

import repository.CriaCarro;

public class MontadoraVolkswagen extends FabricaDeCarros{

    @Override
    public CriaCarro criaCarro() {
        return new Volkswagen();
    }
}
