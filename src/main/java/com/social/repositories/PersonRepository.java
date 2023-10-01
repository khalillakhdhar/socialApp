package com.social.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.social.entities.Person;

public interface PersonRepository extends JpaRepository<Person, Long> {
List<Person> findByNom(String nom);
List<Person> findByEmailOrTel(String email,String tel);
List<Person> findByAgeGreaterThan(int age);
List<Person> findByAgeLessThan(int age);


}
