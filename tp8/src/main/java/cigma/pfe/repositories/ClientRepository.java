package cigma.pfe.repositories;

import cigma.pfe.models.Client;
import cigma.pfe.models.Facture;

import java.util.List;

public interface ClientRepository {
    Client save(Client c);
    Client update(Client c);
    void deleteById(long idClient);
    Client findById(long idClient);

    List<Client> findAll();
    //Facture zone code
    Facture create(Facture f);
    Facture update(Facture f);
    void deleteF(long id);
    List<Facture> read();
}