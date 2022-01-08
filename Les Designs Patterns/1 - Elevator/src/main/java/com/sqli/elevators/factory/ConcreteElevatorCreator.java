package com.sqli.elevators.factory;

import com.sqli.elevators.Elevator;

public class ConcreteElevatorCreator extends ElevatorCreator {

    private static ConcreteElevatorCreator instance;

    // pattern singleton private constructor
    private ConcreteElevatorCreator() {
    }

    @Override
    public Elevator createElevator(String ids, int numberOfFloors) {
        String[] composition = ids.split(":");
        int currentFloor = Integer.parseInt(composition[1]);
        return new Elevator(numberOfFloors , composition[0] , currentFloor);
    }

    public static ConcreteElevatorCreator getInstance() {
        if (instance == null) {
            instance = new ConcreteElevatorCreator();
        }
        return instance;
    }
}
