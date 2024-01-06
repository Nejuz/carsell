package io.github.nejuz.carsell;

import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class MongoDbConfig {

    private MongoTemplate mongoTemplate;
    public MongoDbConfig(MongoTemplate mongoTemplate) {
        this.mongoTemplate = mongoTemplate;
    }
    @EventListener(ApplicationReadyEvent.class)
    private void init(){
        Car car = new Car();
        car.setBrand("BMW");
        car.setModel("E60");
        car.setYear(2005);
        car.setFuel("Diesel");
        mongoTemplate.insert(car);
        List<Car> all = mongoTemplate.findAll(Car.class);
        System.out.println(all);
    }
}
