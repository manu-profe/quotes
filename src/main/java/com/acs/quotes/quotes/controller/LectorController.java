package com.acs.quotes.quotes.controller;

import com.acs.quotes.quotes.model.Lector;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.HashMap;
@RestController
public class LectorController {

    /* Equipo 5 */




    @GetMapping("/getLector")
    public String getLector(Lector lector){
        String datos="";
        for(String lt: lector.getLector()) {
            /*if(lector.getName().equals(lt)){
                return "Lector: " + lector.getName() + "Id: " + lector.getIdLector() + "Genero: " + lector.getGender() + "Fecha de nacimiento :" + lector.getDateBirth() ;
            }*/
            datos+=lt.toString();
        }
        return datos;
    }

   /* @DeleteMapping("/DeleteLector")
    public String deleteLector(String id){
        for(Lector lector : lector){
            if(lector.getIdLector().equals(id)){
                return "";
            }
        }
        return "No se elimino correctamente";
    }


    /* Equipo 1 */

    @PostMapping("/CreateLector")
    public String setLector(){
        return "lector creado:";
    }

    @PutMapping("UpdateLector")
    public String updateLector(){
        return "h";
    }
}
