package com.example.pizzamakerservice.model;

import lombok.*;

@Getter
@Setter
@ToString
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor


public class Product {

    private int id;

    private int productTypeId;

    private String name;

    private Float price;

    private String imagePath;

    private String currency;

}