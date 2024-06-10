package com.midohegazi.mido_beer_service.web.controller;

import com.midohegazi.mido_beer_service.web.model.BeerDTO;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import  static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;

@WebMvcTest(BeerDTO.class)
class BeerControllerTest {
    @Autowired
    public MockMvc mockMvc;

    @Test
    void getBeerById() throws Exception {
        BeerDTO bearDto = new BeerDTO();
        bearDto.setBeerName("MidoBear");
        mockMvc.perform(get("/api/v1/beer/2d4dfc9e-86da-4f3b-928e-3b827ec99c53").accept(MediaType.APPLICATION_JSON))
                .andExpect(MockMvcResultMatchers.status().isOk());
    }
}