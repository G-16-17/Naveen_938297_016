package com.cognizant.truyum.repository;

//import java.sql.Date;
import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.cognizant.truyum.model.MenuItem;


public interface MenuItemRepository extends JpaRepository<MenuItem, Integer> {
	@Query("select m from MenuItem m where m.active=?1 and m.dateOfLaunch<?2")
	List<MenuItem> findByActiveNotAndDateOfLaunchBefore(String active,Date dateOfLaunch);

}