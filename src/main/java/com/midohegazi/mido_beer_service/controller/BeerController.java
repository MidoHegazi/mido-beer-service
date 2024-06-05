package com.midohegazi.mido_beer_service.controller;

import com.midohegazi.mido_beer_service.web.model.BeerDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/api/v1/beer")
public class BeerController {

    @GetMapping("/{beerId}")
    public ResponseEntity<BeerDTO> getBearById(@PathVariable ("beerId")UUID bearId){
        //todo impl
        return new ResponseEntity<>(BeerDTO.builder().build(), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity saveNewBeer(@RequestBody BeerDTO beerDTO){
        //todo impl
        return new ResponseEntity(BeerDTO.builder().build(),HttpStatus.CREATED);
    }

    @PutMapping("/{beerId}")
    public ResponseEntity updateBeerById(@PathVariable ("beerId") UUID id,@RequestBody BeerDTO beerDTO){
        return new ResponseEntity(beerDTO,HttpStatus.NO_CONTENT);
    }
}
