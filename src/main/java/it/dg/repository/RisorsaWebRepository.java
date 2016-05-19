package it.dg.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import it.dg.pojo.RisorsaWeb;

@Repository
public interface RisorsaWebRepository extends JpaRepository<RisorsaWeb, Integer>{

}
