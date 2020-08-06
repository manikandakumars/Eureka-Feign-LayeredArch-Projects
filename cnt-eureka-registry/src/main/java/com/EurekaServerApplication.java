package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.context.ApplicationContext;

/**
 * @Mani S
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaServerApplication 
{
    public static void main( String[] args )
    {
        System.out.println( "Service Discovery " );
        ApplicationContext context= SpringApplication.run(EurekaServerApplication.class, args);
    }
}
