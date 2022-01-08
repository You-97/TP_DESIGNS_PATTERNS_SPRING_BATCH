package com.sqli.elevators;

import com.sqli.elevators.state.ElevatorState;
import com.sqli.elevators.state.RestState;

public class Elevator {

    private int numberOfFloors;
    private String idElevator;
    private int currentFloor;

    private ElevatorState elevatorState;

    public Elevator(int numberOfFloors, String idElevator, int currentFloor) {
        this.elevatorState = new RestState(this);
        this.numberOfFloors = numberOfFloors;
        this.idElevator = idElevator;
        this.currentFloor = currentFloor;
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public void setNumberOfFloors(int numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }

    public String getIdElevator() {
        return idElevator;
    }

    public void setIdElevator(String idElevator) {
        this.idElevator = idElevator;
    }

    public int getCurrentFloor() {
        return currentFloor;
    }

    public void setCurrentFloor(int currentFloor) {
        this.currentFloor = currentFloor;
    }

    public void setElevatorState(ElevatorState elevatorState) {
        this.elevatorState = elevatorState;
    }

    public ElevatorState getElevatorState() {
        return elevatorState;
    }
}
