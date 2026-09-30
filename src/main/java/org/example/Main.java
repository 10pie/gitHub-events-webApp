package org.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    if(args.length>0){
        SpringApplication.run(Main.class,args);
    }
    else{
        System.err.println("Error: Please provide Github Username as argument");
        System.exit(1);
    }
    }
}