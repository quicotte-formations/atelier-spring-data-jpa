/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.service;

import java.util.Date;
import java.util.List;
import org.springframework.data.repository.CrudRepository;
import streaming.entity.Client;

/**
 *
 * @author formation
 */
public interface ClientServiceCrud extends CrudRepository<Client, Long>{
    
    public List<Client> findAllByReservationsChambresHotelNomAndReservationsDateDebutGreaterThanAndReservationsDateFinLessThan(String nomHotel, Date dateAfter, Date dateBefore);
    public List<Client> findAllByReservationsChambresHotelNomAndReservationsDateDebutBetween(String nomHotel, Date dateAfter, Date dateBefore);
    public List<Client> findAllByReservationsChambresHotelNomAndReservationsDateDebutAfterAndReservationsDateFinBefore(String nomHotel, Date dateAfter, Date dateBefore);
    
    public Client findOneByReservationsId(Long id);
}
