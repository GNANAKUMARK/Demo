package com.ing.dao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ing.entity.Breach;

@Repository
public interface BreachDAO extends JpaRepository<Breach, Integer> {

}
