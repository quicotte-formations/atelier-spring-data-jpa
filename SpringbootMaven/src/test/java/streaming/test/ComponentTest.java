/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.test;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import streaming.component.A;
import streaming.spring.SpringConfig;

/**
 *
 * @author formation
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes=SpringConfig.class)
public class ComponentTest {
    
    @Autowired
    private A monA;
    
    @Test
    public void verifCNotNull(){
        
        Assert.assertNotNull( monA.getB().getC() );
    }
    
    @Test
    public void verifBNotNull(){
        
        Assert.assertNotNull( monA.getB() );
    }
    
//    @Test
//    public void verifANotNull(){
//        
//        Assert.assertNotNull(monA);
//    }
    
}
