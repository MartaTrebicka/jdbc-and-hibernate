package pl.sda.orange2.dao;

import pl.sda.orange2.entity.Car;

import java.util.List;

public class CarDao implements  DataAccess <Car, Long>{
@Override
    public void save(Car car) {

    }
@Override
    public List<Car> findAll() { //metoda do wyszukiwania wszystkich obietków
   return List.of();
    }
    @Override
    // metoda do szukania po nr id
    public Car findById (Long id) {
        return null;
    }
    @Override
    public void deleteById(Long id) {

    }

}
