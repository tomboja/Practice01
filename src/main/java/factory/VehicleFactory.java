package factory;

import services.Bike;
import services.Car;
import services.Vehicle;

/**
 * @ProjectName: Practice01
 * @Author: Temesgen D.
 * @Date: 3/3/22
 */

public class VehicleFactory {

    public static Vehicle getCarVehicle() {
        return new Car();
    }

    public static Vehicle getBikeVehicle() {
        return new Bike();
    }
}
