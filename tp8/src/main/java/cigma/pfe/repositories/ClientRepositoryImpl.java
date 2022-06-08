package cigma.pfe.repositories;

import cigma.pfe.models.Client;
import cigma.pfe.models.Facture;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;

public class ClientRepositoryImpl implements ClientRepository{
    EntityManagerFactory emf =
            Persistence.createEntityManagerFactory("unit_clients");
    EntityManager em = emf.createEntityManager();
    @Override
    public Client save(Client c) {
        em.getTransaction().begin();
        em.persist(c);
        em.getTransaction().commit();
        return null;
    }
    @Override
    public Client update(Client c) {
        em.getTransaction().begin();
        Client currentClient = em.find(Client.class,c.getId());
        currentClient.setName(c.getName());
        em.persist(currentClient);
        em.getTransaction().commit();
        return null ;
    }
    @Override
    public void deleteById(long idClient) {
        em.getTransaction().begin();
        Client clientInDataBase =
                em.find(Client.class,idClient);
        em.remove(clientInDataBase);
        em.getTransaction().commit();
    }
    @Override
    public Client findById(long idClient) {
        return em.find(Client.class,idClient);
    }

    @Override
    public List<Client> findAll() {
        List<Client> p2 = em.createQuery("Select e from TClients e").getResultList();
        return p2 ;
    }

    //Facture zone code


    @Override
    public Facture create(Facture f) {
        em.getTransaction().begin();
        em.persist(f);
        em.getTransaction().commit();
        return null;
    }

    @Override
    public Facture update(Facture f) {
        em.getTransaction().begin();
        Facture currentFacture = em.find(Facture.class,f.getId());
        currentFacture.setDate(f.getDate());
        currentFacture.setAmount(f.getAmount());
        em.persist(currentFacture);
        em.getTransaction().commit();
return null;
    }

    @Override
    public void deleteF(long idf) {
        em.getTransaction().begin();
        Facture FactureInDataBase =
                em.find(Facture.class,idf);
        em.remove(FactureInDataBase);
        em.getTransaction().commit();

    }

    @Override
    public List<Facture> read() {
        List<Facture> p1 = em.createQuery("Select e from TFactures e").getResultList();
        return p1 ;
    }
}
