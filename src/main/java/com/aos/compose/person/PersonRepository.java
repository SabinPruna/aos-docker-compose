package com.aos.compose.person;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

//This will be AUTO IMPLEMENTED by Spring into a Bean called personRepository
@Repository
public interface PersonRepository extends CrudRepository<Person, Integer> {

}
