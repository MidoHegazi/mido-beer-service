package com.midohegazi.mido_beer_service.domain;

import com.midohegazi.mido_beer_service.web.model.BeerStyleEnum;
import lombok.*;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.time.OffsetDateTime;
import java.util.UUID;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Beer {

    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
    @Column(length = 35, columnDefinition = "varchar", updatable = false, nullable = false)
    private UUID id;

    @Version
    private Integer version;

    private Timestamp createdDate;
    private Timestamp lastModifiedDate;
    private String beerName;
    private BeerStyleEnum beerStyle;

    @Column(unique = true)
    private Long upc;

    private BigDecimal price;
    private Integer minOnHand;
    private Integer quantityToBrew;
}
