package com.midohegazi.mido_beer_service.web.controller;

import com.midohegazi.mido_beer_service.web.model.BeerDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/api/v1/beer")
public class BeerController {

    @GetMapping("/{beerId}")
    public ResponseEntity<BeerDTO> getBeerById(@PathVariable ("beerId")UUID beerId){
        BeerDTO beerDTO = new BeerDTO();
        beerDTO.setId(beerId);
        beerDTO.setBeerName("MidoBear");
        beerDTO.setVersion(2024);
        return new ResponseEntity<>(beerDTO, HttpStatus.OK);
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
