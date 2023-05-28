package guru.sfg.beer.inventory.service.services;

import guru.sfg.brewery.model.events.BeerOrderDto;

public interface AllocationService {

    Boolean allocateOrder(BeerOrderDto beerOrderDto);

}
