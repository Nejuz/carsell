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
    public void init(){
        Car car = new Car();
        car.setPrice(20999);
        car.setMileage(190000);
        car.setBrand("Ford");
        car.setGeneration("Mondeo");
        car.setModel("Mk3");
        car.setYear(2004);
        car.setTransmission("Automatic");
        car.setEngineSize("2497cm3");
        car.setFuel("Gasoline");
        car.setUserTitle("szrot wafla");
        mongoTemplate.insert(car);
        List<Car> all = mongoTemplate.findAll(Car.class);
        System.out.println(all);
    }
}
