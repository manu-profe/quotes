package com.acs.quotes.quotes.controller;

import com.acs.quotes.quotes.model.Reader;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
@RestController
public class ReaderController {
    private final List<Reader> readers = new ArrayList<>();

@GetMapping("/searchreader/{document}")
    public String lookingReader(@PathVariable String document,@RequestBody Reader reader){

    for(short i = 0; i < readers.size(); i++){

        if(readers.get(i).getDocumentId().equals(document)) {
            readers.get(i).setName(reader.getName());
            readers.get(i).setLastName(reader.getLastName());
            readers.get(i).setBirth(reader.getBirth());
            readers.get(i).setGender(reader.getGender());

            return "Update successfull";
        }

    }
    return "This Reader doesn't Exists in the system, plase check out your document ID";
    //return "Saludos " + " " + document +" Tu nombre es capturado mediante POST";
}


@PostMapping(path="/readers")
public String addReader(@RequestBody Reader reader) {

    //return "Hi: " + reader.toString();
    for(Reader rd: readers){
        if(rd.getDocumentId().equals(reader.getDocumentId())){
            return "Document id already exist";
        }
    }
    readers.add(reader);
    return "Reader create";
}





}
