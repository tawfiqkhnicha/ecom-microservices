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
                .route("customer_route", r ->
                        r.path("/customers/**")
                        .uri("http://127.0.0.1:8080"))
                .route("inventory_route", r ->
                        r.path("/products/**")
                                .uri("http://127.0.0.1:8081"))
                .build();
    }
}
