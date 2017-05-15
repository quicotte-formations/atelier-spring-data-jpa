/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

/**
 *
 * @author formation
 */
@Component
public class A {
    
    private B b = new B();

    public B getB() {
        return b;
    }

    public void setB(B b) {
        this.b = b;
    }
    
    
}
