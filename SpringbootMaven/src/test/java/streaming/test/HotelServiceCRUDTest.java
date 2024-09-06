/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.test;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceUnit;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import streaming.dao.ClientDAO;
import streaming.entity.Client;
import streaming.entity.Hotel;
import streaming.service.ClientServiceCrud;
import streaming.service.HotelServiceCRUD;
import streaming.spring.SpringConfig;

/**
 *
 * @author formation
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes=SpringConfig.class)
public class HotelServiceCRUDTest {
    
	@Autowired
	private ClientServiceCrud clientServiceCrud;
	
    @Test
    public void testVide(){
    	
    	Client client = new Client();
    	client.setNom("Digna");
    	client.setPrenom("Thomas");
    	clientServiceCrud.save(client);
    }
    
//    @Autowired
//    private HotelServiceCRUD service;
//    
//    @Before
//    public void avant(){
//        
//        // Supprimer ts hotels
//        service.deleteAll();
//        
//        // Ajoute 3 hotels
//        List<Hotel> listeHotels = new ArrayList<Hotel>();
//        
//        Hotel h = new Hotel();
//        h.setId( 1L );
//        h.setNom("Hotel Gambetta");
//        listeHotels.add(h);
//        
//        h = new Hotel();
//        h.setId( 2L );
//        h.setNom("Hotel Montparnasse");
//        listeHotels.add(h);
//        
//        h = new Hotel();
//        h.setId( 3L );
//        h.setNom("Hotel Rivoli");
//        listeHotels.add(h);
//        
//        service.save(listeHotels);
//    }
//    
//    @Test
//    public void verifHotelRivoliExiste(){
//        
//        Hotel h = service.findOneByNom("Hotel Rivoli");
//        
//        Assert.assertNotNull(h);
//    }
}
