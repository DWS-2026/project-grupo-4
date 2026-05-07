package es.nextjourney.vs_nextjourney.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import es.nextjourney.vs_nextjourney.model.Place;

// Añade estos imports
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Page;

public interface PlaceRepository extends JpaRepository<Place, Long> {

	Optional<Place> findFirstByNameIgnoreCase(String name);
	Page<Place> findByDestinationId(Long destinationId, Pageable pageable);

}