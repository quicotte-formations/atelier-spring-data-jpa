/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.service;

import java.util.Date;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import streaming.dao.MailDAO;
import streaming.entity.Journal;
import streaming.entity.Mail;

/**
 *
 * @author formation
 */
@Service
public class MailService {
    
    @Autowired
    private JournalService journalService;
    
    @Autowired
    private MailDAO dao;
    
    public void ecrire(Mail m){
        dao.ajouter(m);// Ajout mail en BD
        
        // Journalisation
        journalService.ecrire( m.getTitre() + " " + m.getMessage() );
    }
}
