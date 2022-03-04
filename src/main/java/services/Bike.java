package services;

/**
 * @ProjectName: Practice01
 * @Author: Temesgen D.
 * @Date: 3/3/22
 */

public class Bike implements Vehicle{
    @Override
    public void move() {
        System.out.println("Bike drives at 10 mph");
    }
}
