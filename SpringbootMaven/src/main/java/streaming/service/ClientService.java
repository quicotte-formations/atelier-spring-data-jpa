/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import streaming.dao.ClientDAO;
import streaming.entity.Client;

/**
 *
 * @author formation
 */
@Service
public class ClientService {
    
    @Autowired
    private ClientDAO dao;
    
    public Client rechercher(long id){
        return dao.rechercher(id);
    }
    
    @Transactional
    public void supprimer(long id){
        dao.supprimer(id);
    }
    
    @Transactional
    public void modifier(Client cli){
        dao.modifier(cli);
    }
    
    @Transactional
    public void ajouter(Client cli){
        dao.ajouter(cli);
    }
    
    public List<Client> lister(){
        
        return dao.lister();
    }
}
