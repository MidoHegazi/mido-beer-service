package com.midohegazi.mido_beer_service.repositories;

import com.midohegazi.mido_beer_service.domain.Beer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface BeerRepository extends JpaRepository<Beer, UUID> {
}
