package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @ Mani S
 *
 */
@SpringBootApplication
@EnableEurekaClient
@EnableAutoConfiguration(exclude = {org.springframework.boot.autoconfigure.gson.GsonAutoConfiguration.class})
@EnableFeignClients
public class CustomerApplication 
{
    public static void main( String[] args )
    {
        System.out.println( "Customer Application !" );
        SpringApplication.run(CustomerApplication.class, args);
    }
}
