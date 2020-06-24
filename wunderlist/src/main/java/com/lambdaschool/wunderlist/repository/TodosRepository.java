package com.lambdaschool.wunderlist.repository;

import com.lambdaschool.wunderlist.models.Todos;
import org.springframework.data.repository.CrudRepository;

public interface TodosRepository extends CrudRepository<Todos, Long>
{
}
