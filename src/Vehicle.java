public abstract class Vehicle {
    private int speed;
    public Vehicle()
    {
        this.speed=0;
    }
    public abstract void speedUp();

    protected void printSpeedIncrease(String vehicleType, int increaseAmount)
    {
        System.out.println(vehicleType+"a crescut viteza cu"+increaseAmount+"unitati.");
    }
    public int getSpeed()
    {
        return speed;
    }
}

class Car extends Vehicle
{
    public void speedUp()
    {
        int increaseAmount=10;
        super.printSpeedIncrease("masica",increaseAmount);
        super.getSpeed();
    }
}

class Bicycle extends Vehicle
{
    public void speedUp()
    {
        int increaseAmount=5;
        super.printSpeedIncrease("bicicleta",increaseAmount);
        super.getSpeed();
    }

}