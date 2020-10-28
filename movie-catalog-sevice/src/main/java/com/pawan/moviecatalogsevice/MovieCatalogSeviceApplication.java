package com.pawan.moviecatalogsevice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

@SpringBootApplication
public class MovieCatalogSeviceApplication {

    @Bean
    @LoadBalanced
    public RestTemplate geRestTemplate(){
        return new RestTemplate();
    }

    /*@Bean
    public WebClient.Builder getWebClientBuilder(){
        return WebClient.builder();
    }
*/
    public static void main(String[] args) {
        SpringApplication.run(MovieCatalogSeviceApplication.class, args);
    }

}
