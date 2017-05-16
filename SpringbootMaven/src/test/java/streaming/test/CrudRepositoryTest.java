/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.test;

import junit.framework.Assert;
import org.junit.Test;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import streaming.entity.Client;
import streaming.spring.SpringConfig;
import streaming.service.ClientServiceCrud;

/**
 *
 * @author formation
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes=SpringConfig.class)
public class CrudRepositoryTest {
    
    @Autowired
    private ClientServiceCrud dao;
    
    @Before
    public void avant(){
        
        // Vide la base
        dao.deleteAll();
        
        // Ajoute clients
        Client cli1 = new Client();
        cli1.setPrenom("El Nahyane");
        dao.save(cli1);
        
        Client cli2 = new Client();
        cli2.setPrenom("Samba");
        dao.save(cli2);
    }
    
    @Test
    public void verif2UtilsEnDB(){
        
        Assert.assertEquals(2, dao.count());
    }
}
