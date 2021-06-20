package factorymethod;

/*
简单工厂扩展性不好
 */
public class SimpleVehicleFactory {
    public Car createCar() {
        //before processing
        return new Car();
    }

    public Broom createBroom() {
        return new Broom();
    }

    public Plane creatPlane() {
        return new Plane();
    }
}
