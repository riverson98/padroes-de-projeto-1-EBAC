package entities;

import repository.CriaCarro;

public class MontadoraChevrolet extends FabricaDeCarros {

    @Override
    public CriaCarro criaCarro() {

        return new Chevrolet();
    }

}
