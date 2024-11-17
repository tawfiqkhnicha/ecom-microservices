package iibdcc.enset.customerservice.config;

import iibdcc.enset.customerservice.entities.Customer;
import iibdcc.enset.customerservice.repositories.CustomerRepository;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CommandLineRunnerConfig {

    @Bean
    CommandLineRunner commandLineRunner(CustomerRepository customerRepository){

        List<Customer> customers = IntStream.range(0, 10)
                .mapToObj(i -> Customer.builder()
                        .fullName("username_" + i)
                        .email("username_" + i + "@gmail.com")
                        .build()).toList();

        return args -> {
            customerRepository.saveAll(customers);
        };
    }
}
