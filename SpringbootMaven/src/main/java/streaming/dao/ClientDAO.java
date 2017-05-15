/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import streaming.entity.Client;

/**
 *
 * @author formation
 */
@Repository
public class ClientDAO {
    
    @PersistenceContext
    private EntityManager em;
    
    public Client rechercher(long id){
        
        return em.find(Client.class, id);
    }
    
    public List<Client> lister(){
        
        return em.createQuery("SELECT c FROM Client c ORDER BY c.nom, c.prenom").getResultList();
    }
    
    public void supprimer(long cliId){
        
        em.createQuery("DELETE FROM Client c WHERE id=" + cliId).executeUpdate();
    }
    
    public void modifier(Client cli){
        
        em.merge(cli);
    }
    
    public void ajouter(Client cli){
        
        em.persist(cli);
    }
}
