package cigma.pfe.services;

import cigma.pfe.models.Client;
import cigma.pfe.models.Facture;

import java.util.List;

public interface ClientService {
    Client save(Client c);
    Client modify(Client c);
    void removeById(long id);
    Client getById(long id);
    List<Client> getAll();

    // Facture zone code
    Facture create(Facture f);
    Facture update(Facture f);
    void delete(long id);
    List<Facture> read();
}