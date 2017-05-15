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
import streaming.entity.Journal;

/**
 *
 * @author formation
 */
@Repository
public class JournalDAOJpa {
    
    @PersistenceContext
    private EntityManager em;
    
    public Journal rechercher(long id){

        return em.find(Journal.class, id);
//        return (Journal) em.createQuery("SELECT j FROM Journal j WHERE j.id=" + id).getSingleResult();
    }
    
    public List<Journal> lister(){
        
        return em.createQuery("SELECT j FROM Journal j").getResultList();
    }
    
    public void supprimer(long id){
        
        em.createQuery("DELETE FROM Journal j WHERE j.id=" + id).executeUpdate();
    }
    
    public void modif(Journal j){
        em.merge(j);
    }
    
    public void ajouter(Journal j){
        
        em.persist(j);
    }
}
