
package com.desarrollo.ecommerce.service;

import com.desarrollo.ecommerce.model.Orden;
import com.desarrollo.ecommerce.repository.InterfaceOrdenRepository;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author rober
 */

@Service
public class OrdenServiceImplement implements InterfaceOrdenService{
    
    @Autowired
    private InterfaceOrdenRepository ordenRepository;

    @Override
    public Orden save(Orden orden) {
         return ordenRepository.save(orden);
    }
    
    public List<Orden> findAll(){
        return ordenRepository.findAll();
    }
    
    public String generarDigitosOrden(int num){
        
        String digitosOrden = String.valueOf(num);
        
        int numDigitos = digitosOrden.length();
        
        List<Orden> ordenes = findAll();
        List<Integer> numeros = new ArrayList<>();
        
        ordenes.stream().forEach(o -> numeros.add(Integer.parseInt(o.getNumero())));
        
        if(ordenes.isEmpty()){
            for(int j= numDigitos; j <= 9; j++){
            digitosOrden = "0" + digitosOrden;
          }
            
        }
       
        return digitosOrden;
    }
    
}
