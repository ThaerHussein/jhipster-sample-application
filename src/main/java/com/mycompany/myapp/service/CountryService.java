package com.mycompany.myapp.service;

import com.mycompany.myapp.service.dto.CountryDTO;
import java.util.List;
import java.util.Optional;

/**
 * Service Interface for managing {@link com.mycompany.myapp.domain.Country}.
 */
public interface CountryService {
    /**
     * Save a country.
     *
     * @param countryDTO the entity to save.
     * @return the persisted entity.
     */
    CountryDTO save(CountryDTO countryDTO);

    /**
     * Updates a country.
     *
     * @param countryDTO the entity to update.
     * @return the persisted entity.
     */
    CountryDTO update(CountryDTO countryDTO);

    /**
     * Partially updates a country.
     *
     * @param countryDTO the entity to update partially.
     * @return the persisted entity.
     */
    Optional<CountryDTO> partialUpdate(CountryDTO countryDTO);

    /**
     * Get all the countries.
     *
     * @return the list of entities.
     */
    List<CountryDTO> findAll();

    /**
     * Get all the CountryDTO where Location is {@code null}.
     *
     * @return the {@link List} of entities.
     */
    List<CountryDTO> findAllWhereLocationIsNull();

    /**
     * Get the "id" country.
     *
     * @param id the id of the entity.
     * @return the entity.
     */
    Optional<CountryDTO> findOne(Long id);

    /**
     * Delete the "id" country.
     *
     * @param id the id of the entity.
     */
    void delete(Long id);

    /**
     * Search for the country corresponding to the query.
     *
     * @param query the query of the search.
     * @return the list of entities.
     */
    List<CountryDTO> search(String query);
}
