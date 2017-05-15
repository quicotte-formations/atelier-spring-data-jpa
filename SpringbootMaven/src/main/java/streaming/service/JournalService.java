/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.service;

import java.util.Date;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import streaming.dao.JournalDAOJpa;
import streaming.entity.Journal;

/**
 *
 * @author formation
 */
@Service
public class JournalService {
    
    @Autowired
    private JournalDAOJpa dao;
    
    @Transactional
    public void ecrire(String message){
        
        Journal j = new Journal();
        j.setMessage(message);
        j.setDateHeureCreation( new Date() );
        
        dao.ajouter(j);
    }
}
