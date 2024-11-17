package iibdcc.enset.customerservice.entities;

import org.springframework.data.rest.core.config.Projection;

@Projection(types = Customer.class, name = "all")
public interface CustomerProjection {
    String getFullName();
    String getEmail();
}
