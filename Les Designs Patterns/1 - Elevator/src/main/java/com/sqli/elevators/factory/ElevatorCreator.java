package com.sqli.elevators.factory;

import com.sqli.elevators.Elevator;

public abstract class ElevatorCreator {

    public abstract Elevator createElevator(String ids , int numberOfFloors);
}
