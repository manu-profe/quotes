package com.acs.quotes.quotes.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class HomeController {

    /* Equipo 5 */

    @GetMapping("/getLector")
    public String getLector(){
        return "";
    }

    @DeleteMapping("/DeleteLector")
    public String deleteLector(){
        return "El lector ha sido eliminado exitosamente";
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
