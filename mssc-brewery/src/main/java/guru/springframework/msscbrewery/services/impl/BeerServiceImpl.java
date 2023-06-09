package guru.springframework.msscbrewery.services.impl;

import guru.springframework.msscbrewery.services.BeerService;
import guru.springframework.msscbrewery.web.model.BeerDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@Slf4j
public class BeerServiceImpl implements BeerService
{
    @Override
    public BeerDto getBeerById(UUID beerId)
    {
        return BeerDto.builder()
                .id(UUID.randomUUID())
                .beerName("Galaxy Cat")
                .beerStyle("Pale Ale")
                .build();
    }
    @Override
    public BeerDto createBeer(BeerDto beerDto)
    {
        return BeerDto.builder()
                .id(UUID.randomUUID())
                .build();
    }

    @Override
    public void updateBeer(UUID beerId, BeerDto beerDto)
    {

    }

    @Override
    public void deleteById(UUID beerId)
    {
        log.debug("Deleting beer with id: {}", beerId);
    }
}
