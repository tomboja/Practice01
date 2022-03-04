package services;

/**
 * @ProjectName: Practice01
 * @Author: Temesgen D.
 * @Date: 3/3/22
 */

public class Car implements Vehicle{

    @Override
    public void move() {
        System.out.println("Car drives at 50 mph");
    }
}
