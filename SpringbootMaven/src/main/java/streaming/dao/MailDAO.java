/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import streaming.entity.Mail;

/**
 *
 * @author formation
 */
@Repository
public class MailDAO {
    
    @PersistenceContext
    private EntityManager em;
    
    public void ajouter(Mail m){
        em.persist(m);
    }
}
