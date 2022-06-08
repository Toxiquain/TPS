package cigma.pfe.controllers;

import cigma.pfe.models.Client;
import cigma.pfe.models.Facture;
import cigma.pfe.services.ClientService;
import org.apache.logging.log4j.core.net.Facility;

import java.util.List;

public class ClientController {

    private ClientService service ;
    public ClientController(ClientService c){ this.service =c;}
    public void setService(ClientService service) {
        this.service = service;
    }
    public void save(Client c){
        service.save(c);
    }
    public void modify(Client c){
        service.modify(c);
    }
    public void removeById(long id) {
        service.removeById(id);
    }
    public Client getById(long id) {
        return service.getById(id);
    }
    public List<Client> getAll() {
       return service.getAll();
    }

    // Facture zone code

    public Facture create(Facture f){
        return service.create(f);
    }
    public Facture update(Facture f){
        return service.update(f);
    }
    public void delete(long id){
          service.delete(id);
    }
    public  List<Facture> readAll(){
        return service.read();
    }
}
