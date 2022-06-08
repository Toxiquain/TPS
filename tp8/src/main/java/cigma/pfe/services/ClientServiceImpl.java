package cigma.pfe.services;
import cigma.pfe.models.Client;
import cigma.pfe.models.Facture;
import cigma.pfe.repositories.ClientRepository;

import java.util.List;

public class ClientServiceImpl implements ClientService {
    private ClientRepository clientRepository;
    public ClientServiceImpl(ClientRepository c){this.clientRepository =c;}
    public void setDao(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }
    @Override
    public Client save(Client c) {
        return clientRepository.save(c);
    }
    @Override
    public Client modify(Client c) {
        return clientRepository.update(c);
    }
    @Override
    public void removeById(long id) {
        clientRepository.deleteById(id);
    }
    @Override
    public Client getById(long id) {
        return clientRepository.findById(id);
    }

    @Override
    public List<Client> getAll() {
        return clientRepository.findAll();

    }

    // Facture zone code

    @Override
    public Facture create(Facture f) {
        return clientRepository.create(f);
    }
    @Override
    public Facture update(Facture f) {
        return clientRepository.update(f);
    }

    @Override
    public void delete(long idf) {
        clientRepository.deleteF(idf);
    }

    @Override
    public List<Facture> read() {

       return     clientRepository.read();
    }
}