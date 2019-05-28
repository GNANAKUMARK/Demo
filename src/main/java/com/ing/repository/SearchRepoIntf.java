package com.ing.repository;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.ing.entity.Breach;


@Repository
public interface SearchRepoIntf extends CrudRepository<Breach,Integer> {

 @Query(value = "select * from breach_complaince",nativeQuery = true)
 List<Breach> findAllIncidents();

}

