package me.sinu.springdata.repository;

import me.sinu.springdata.domain.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * Created by SiJohn on 1/2/2015.
 */
public interface PersonRepository extends JpaRepository<Person, Integer> {
    List<Person> getByName(@Param("name") String name);
}
