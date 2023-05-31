package guru.springframework.msscbrewery.services.impl;

import guru.springframework.msscbrewery.services.CustomerService;
import guru.springframework.msscbrewery.web.model.CustomerDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Slf4j
@Service
public class CustomerServiceImpl implements CustomerService
{
    @Override
    public CustomerDto getCustomerById(final UUID customerId)
    {
        return CustomerDto.builder()
                .id(UUID.randomUUID())
                .name("John Snow")
                .build();
    }

    @Override
    public CustomerDto createCustomer(final CustomerDto customerDto)
    {
        return CustomerDto.builder()
                .id(customerDto.getId())
                .build();
    }

    @Override
    public void updateCustomer(final UUID customerId, final CustomerDto customerDto)
    {
        log.debug("Updating the customer with id: {}", customerId);
    }

    @Override
    public void deleteCustomer(final UUID customerId)
    {
        log.debug("Deleting the customer with id: {}", customerId);
    }
}
