package iibdcc.enset.gatewayservice.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RouteLocatorConfig {

    @Bean
    public RouteLocator routeLocator(RouteLocatorBuilder builder){
        return builder.routes()
                .route("customer_route", r -> r
                        .path("/customers/**")
                        .uri("lb://CUSTOMER-SERVICE"))
                .route("inventory_route", r -> r
                        .path("/products/**")
                        .uri("lb://INVENTORY-SERVICE"))
                .build();
    }
}
