package com.ing.dao;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ing.entity.Breach;

@Repository
public interface BreachDAO extends CrudRepository<Breach, Integer> {

	//@Query(value = "update Breach e set e.status= ?2 , e.updatedBy=?3 where e.id=?1")
	@Modifying
	@Query(value="update breach_complaince set status = ?2, updated_by=?3 where id=?1",nativeQuery =true)
	public void updateIncident(Integer id, String status, String updatedBy);

}
