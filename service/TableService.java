package com.example.pizzamakerservice.service;

import com.example.pizzamakerservice.model.Table;

import java.util.List;

public interface TableService {

    Table read(int id);

    List<Table> readAll();

    List<Table> readByBusy(boolean isBusy);

    List<Table> readBySeatCount(int seatCount);

    void create(Table table);

    Table update(int id, Table table);

    void delete(int id);

}
