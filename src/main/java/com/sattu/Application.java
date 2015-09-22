package com.sattu;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("integration-context.xml")
public class Application
{
	

	
    public static void main( String[] args ) throws Exception
    {
        SpringApplication.run(Application.class, args);
       
    }
    
    
}
