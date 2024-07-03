package com.mycompany.myapp.service;

import com.mycompany.myapp.service.dto.DepartmentDTO;
import java.util.List;
import java.util.Optional;

/**
 * Service Interface for managing {@link com.mycompany.myapp.domain.Department}.
 */
public interface DepartmentService {
    /**
     * Save a department.
     *
     * @param departmentDTO the entity to save.
     * @return the persisted entity.
     */
    DepartmentDTO save(DepartmentDTO departmentDTO);

    /**
     * Updates a department.
     *
     * @param departmentDTO the entity to update.
     * @return the persisted entity.
     */
    DepartmentDTO update(DepartmentDTO departmentDTO);

    /**
     * Partially updates a department.
     *
     * @param departmentDTO the entity to update partially.
     * @return the persisted entity.
     */
    Optional<DepartmentDTO> partialUpdate(DepartmentDTO departmentDTO);

    /**
     * Get all the departments.
     *
     * @return the list of entities.
     */
    List<DepartmentDTO> findAll();

    /**
     * Get all the DepartmentDTO where JobHistory is {@code null}.
     *
     * @return the {@link List} of entities.
     */
    List<DepartmentDTO> findAllWhereJobHistoryIsNull();

    /**
     * Get the "id" department.
     *
     * @param id the id of the entity.
     * @return the entity.
     */
    Optional<DepartmentDTO> findOne(Long id);

    /**
     * Delete the "id" department.
     *
     * @param id the id of the entity.
     */
    void delete(Long id);

    /**
     * Search for the department corresponding to the query.
     *
     * @param query the query of the search.
     * @return the list of entities.
     */
    List<DepartmentDTO> search(String query);
}
