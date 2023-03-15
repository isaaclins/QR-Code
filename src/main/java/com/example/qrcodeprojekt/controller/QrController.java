package com.example.qrcodeprojekt.controller;

import com.example.qrcodeprojekt.entity.ItemOnStockEntity;
import com.example.qrcodeprojekt.repository.QrRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class QrController{

    @Autowired

    private QrRepository qrRepository;

    @GetMapping("/{id}")
    public String getId(@PathVariable int id){                                                   // This line declares a method called "getId". The method takes in one parameter, an integer called "id", which is obtained from the URL.
        return "YOU HAVE SCANNED QR CODE WITH ID: " + id;                                        // this line will simply return the id you gave it when browsing to it.
    }                                                                                            // when you browse to localhost:8080/(id), it will display "" YOU HAVE SCANNED QR CODE WITH ID: (id).
                                                                                                 //  It's a simple and easy example of how these Requests work.




    @GetMapping("/V1/{id}")                                                                   // HERE WE GO! okay this line says that if someone makes a Get request to this site, do the method below.
    public Object getIdAndOtherStuff(@PathVariable int id){                                     // This starts the Method. it also defined what the {id} above means, saving whatever variable is on top ofthere as the variable int "id".
        if (qrRepository.findItemByQrcodeId(id) == null){                                       // This line starts an "if" statement that checks to see if there is an item in the database with the "qrcodeId" that matches the "id" passed in the URL. If there is no item with that ID, the method will return the string "This Item does not exist yet!".
            return "This Item does not exist yet!";
        }
        return qrRepository.findItemByQrcodeId(id);                                             //this line will return that item.
    }





    @GetMapping("/all")                                                                       //This is an annotation telling Spring Boot that this method should handle any GET requests at the "/all" URL.
    public List <ItemOnStockEntity> getAllItems(){                                              //This is the start of the method signature. It specifies that the method returns a List of ItemOnStockEntity objects and has no parameters.
        return qrRepository.findAll();                                                          //This line returns all the items from the ItemOnStockEntity entity. It uses a Spring Data JPA repository called "qrRepository" to execute a query to retrieve all the items.

    }
}


