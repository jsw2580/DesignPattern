package abstractfactory;

public class Main {
    public static void main(String[] args) {
        AbstractFactory abstractFactory = new MagicFactory();

        Vehicle car = abstractFactory.createVehicle();
        car.go();
        Weapon ak47 = abstractFactory.createWeapon();
        ak47.shoot();
        Food bread = abstractFactory.createFood();
        bread.printName();
    }
}
