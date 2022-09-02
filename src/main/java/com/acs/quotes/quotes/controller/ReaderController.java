package com.acs.quotes.quotes.controller;

import com.acs.quotes.quotes.model.Reader;
import org.springframework.web.bind.annotation.*;

@RestController
public class ReaderController {

    @GetMapping("/reader")
    public String getReader(){
        Reader reader = new Reader("", "", "","","");
        reader.add_reader();
        String datos = "";
        for(Reader gr: reader.getRd()){
            datos += gr;
        }
        return datos;
    }

    @PostMapping("/add")
    public String addReader(@RequestBody Reader readers){
        return readers.getName();
       /*for(Reader pr: readers.getRd()){
           readers.setName(pr.getName());
           readers.add_reader();

       } */
       //return readers.toString();
    }

    //@DeleteMapping("/Delete")
    /*public String deleteReader(){
        Reader reader = new Reader();
        String dat = "";
        reader.delete_reader();
        for(String dr: reader.getReader()){
            reader.delete_reader();
            dat += dr;
        }
        if(dat.isEmpty() == true){
            return "lista vacia";
        }
        return dat;
    } */

}
