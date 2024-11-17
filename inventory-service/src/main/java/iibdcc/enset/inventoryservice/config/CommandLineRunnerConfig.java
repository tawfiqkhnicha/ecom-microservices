package iibdcc.enset.inventoryservice.config;

import iibdcc.enset.inventoryservice.entities.Product;
import iibdcc.enset.inventoryservice.repositories.ProductRepository;
import java.math.BigDecimal;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CommandLineRunnerConfig {

    @Bean
    CommandLineRunner commandLineRunner(ProductRepository productRepository){
        List<Product> products = IntStream.range(0, 10).mapToObj(i ->
            Product.builder()
                    .id(UUID.randomUUID().toString())
                    .name("product_"+i)
                    .price(new BigDecimal(10+i))
                    .quantity(4)
                    .build()
        ).toList();

        return args -> {
            productRepository.saveAll(products);
        };
    }
}
