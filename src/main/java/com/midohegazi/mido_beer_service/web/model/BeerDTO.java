package com.midohegazi.mido_beer_service.web.model;

import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.UUID;

public class BeerDTO {

    private UUID id;
    private Integer version;
    private OffsetDateTime createdDate;
    private OffsetDateTime lastModifiedDate;
    private String beerName;
    private BeerStyleEnum beerStyle;
    private Long upc;
    private BigDecimal price;

}
