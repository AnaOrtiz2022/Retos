package com.usa.retos.retosciclo4.model;

/**
 *
 * @author ana_o
 */

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "products")

@Data
@NoArgsConstructor
@AllArgsConstructor

public class Product{

    @Id
    private String reference;
    private String brand;
    private String category;
    private String name;
    private String description;
    //private String presentation;
    private boolean availability = true;
    private double price;
    private int quantity;
    private String photography;
}