package com.example.pizzamakerservice;

import com.example.pizzamakerservice.repository.ProductRepository;
import com.example.pizzamakerservice.service.OrderService;
import com.example.pizzamakerservice.service.impl.OrderServiceImpl;
import com.example.pizzamakerservice.util.SQLConnector;
import com.google.gson.Gson;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        OrderService orderService = new OrderServiceImpl();
        ProductRepository productRepository = new ProductRepository();
        Gson g = new Gson();
        System.out.println(g.toJson(productRepository.read(1)));


        Connection connection = SQLConnector.getConnection();
try{
        PreparedStatement preparedStatement = connection.prepareStatement("insert into `table` values (0,1,1,true)");
        int count = preparedStatement.executeUpdate();
    }catch(SQLException exception){
        exception.printStackTrace();
    }
}
}