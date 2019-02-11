package com.lambdaschool;

public class Horse extends AbstractVehicle implements Vehicle, Animal
{
    private int fuel = 0;
    private String name;

    public Horse(String name, int fuel)
    {
        this.fuel = fuel;
        this.name = name;
    }

    public Horse(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    @Override
    public void eat(int i)
    {
        fuel = fuel + 1;
    }

    @Override
    public String speak()
    {
        return "Neigh";
    }

    @Override
    public String getPath()
    {
        return "Grass";
    }

    @Override
    public void move()
    {
        fuel = fuel - 1;
    }

    @Override
    public int getFuelLevel()
    {
        return fuel;
    }

    @Override
    public void addFuel(int i)
    {
        fuel = fuel + 1;
    }

    @Override
    public String toString()
    {
        return "Horse{" +
                "fuel=" + fuel +
                ", name='" + name + '\'' +
                ", fuel=" + fuel +
                '}';
    }
}
