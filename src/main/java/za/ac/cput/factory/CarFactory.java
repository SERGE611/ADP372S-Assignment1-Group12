package za.ac.cput.factory;

import za.ac.cput.domain.Car;

import static za.ac.cput.util.Helper.isNullOrEmpty;

public class CarFactory {
    public static Car createCar(boolean isHasTowBar) {

        if(isNullOrEmpty(isHasTowBar)) {
            return null;
        }

        return new Car.CarBuilder()
                .setHasTowBar(isHasTowBar)
                .build();
    }
}
