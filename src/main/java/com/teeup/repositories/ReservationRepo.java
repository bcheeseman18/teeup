package com.teeup.repositories;

import com.teeup.entities.GolfCourse;
import com.teeup.entities.Request;
import com.teeup.entities.Reservation;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by BUBBABAIRD on 6/1/17.
 */
public interface ReservationRepo extends CrudRepository<Reservation, Integer> {

//    @Query("SELECT all FROM GolfCourses WHERE g.name LIKE ?1%")
//    List<GolfCourse> findByNameStartsWith(String name);
}