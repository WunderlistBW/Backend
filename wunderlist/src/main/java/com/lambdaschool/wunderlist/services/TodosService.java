package com.lambdaschool.wunderlist.services;

import com.lambdaschool.wunderlist.models.Todos;

import java.util.List;

public interface TodosService
{
    List<Todos> findAll();

    Todos save(Todos todo);

    Todos update(long id);

    void delete(long id);
}
