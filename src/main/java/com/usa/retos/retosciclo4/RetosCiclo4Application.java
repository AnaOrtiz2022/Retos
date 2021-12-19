package com.usa.retos.retosciclo4;

import com.usa.retos.retosciclo4.Repository.crudRepository.ProductCrudRepository;
import com.usa.retos.retosciclo4.Repository.crudRepository.UserCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RetosCiclo4Application implements CommandLineRunner{

    @Autowired
    private ProductCrudRepository productCrudRepository;

    @Autowired
    private UserCrudRepository userCrudRepository;

    public static void main(String[] args) {
        SpringApplication.run(RetosCiclo4Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        productCrudRepository.deleteAll();
        userCrudRepository.deleteAll();
    }
}
