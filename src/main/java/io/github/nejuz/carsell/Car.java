package io.github.nejuz.carsell;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Car {
    @Id ObjectId databaseId;
    public String brand;
    public String generation;
    public String model;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int mileage;
    public int year;
    public String fuel;
    public String transmission;
    public String horsepower;
    public String userTitle;
    public String Title;
    public int price;
    public String image;
    public String engineSize;

    public ObjectId getId() {
        return ObjectId.get();
    }

    public void setId(ObjectId objectId) {
        this.databaseId = objectId;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getGeneration() {
        return generation;
    }

    public void setGeneration(String generation) {
        this.generation = generation;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getFuel() {
        return fuel;
    }

    public void setFuel(String fuel) {
        this.fuel = fuel;
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    public String getHorsepower() {
        return horsepower;
    }

    public void setHorsepower(String horsepower) {
        this.horsepower = horsepower;
    }

    public String getUserTitle() {
        return userTitle;
    }

    public void setUserTitle(String userTitle) {
        this.userTitle = userTitle;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = getBrand() + getGeneration();
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getEngineSize() {
        return engineSize;
    }

    public void setEngineSize(String engineSize) {
        this.engineSize = engineSize;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + databaseId +
                ", brand='" + brand + '\'' +
                ", generation='" + generation + '\'' +
                ", mileage=" + mileage +
                ", year=" + year +
                ", fuel='" + fuel + '\'' +
                ", transmission='" + transmission + '\'' +
                ", horsepower='" + horsepower + '\'' +
                ", userTitle='" + userTitle + '\'' +
                ", Title='" + Title + '\'' +
                ", price=" + price +
                ", image='" + image + '\'' +
                ", engineSize='" + engineSize + '\'' +
                '}';
    }
}
