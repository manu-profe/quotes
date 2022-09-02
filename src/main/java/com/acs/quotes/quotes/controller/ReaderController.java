package com.acs.quotes.quotes.controller;

import com.acs.quotes.quotes.model.Reader;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ReaderController {
    private final List<Reader> reader=new ArrayList<>();
    @GetMapping("/readers{name}")
    public String getReader(String name){
        String matchNameLector="";
        for(Reader gr: reader){
            if (gr.getName().equals(name)){
                matchNameLector+="-----------------\nThe name of the reader is: "+
                        gr.getName()+" and the last name is: "+
                        gr.getLastName()+" the gender of the reader is "+
                        gr.getGender()+" and his birth date is "+
                        gr.getBirth()+" and his document is "+gr.getDocumentId();
            }
        }
        if (matchNameLector==""){
            return "The reader search not found";
        }else{
            return matchNameLector;
        }
    }
    @DeleteMapping("/delete{documentId}")
    public void deleteReader(String documentId){
        for(Reader gr: reader){
            if (gr.getDocumentId().equals(documentId)){
                reader.remove(gr);            }
        }
    }
}
