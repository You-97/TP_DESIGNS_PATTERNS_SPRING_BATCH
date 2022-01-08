package com.sqli.elevators;

import com.sqli.elevators.factory.ConcreteElevatorCreator;
import com.sqli.elevators.factory.ElevatorCreator;

import java.util.HashMap;
import java.util.Map;

public class Building {

    private int numberOfFloors;
    private HashMap<String, Elevator> elevators = new HashMap<>();

    private ElevatorCreator elevatorCreator = ConcreteElevatorCreator.getInstance();

    public Building(int numberOfFloors, String... buildingElevators) 
      {
        this.numberOfFloors = numberOfFloors;
        for (String identifier : buildingElevators) {
            Elevator elevator = elevatorCreator.createElevator(identifier, numberOfFloors);
            this.elevators.put(elevator.getIdElevator(), elevator);
        }
    }

    public String requestElevator() {
        return requestElevator(this.numberOfFloors);
    }

    public String requestElevator(int requestedFloor) {
        int min = Integer.MAX_VALUE;
        String ansElevator = "";
        for (Map.Entry<String, Elevator> elevator : elevators.entrySet()) {
            if (elevator.getValue().getElevatorState().distanceFromFloor(requestedFloor) != -1
                    && elevator.getValue().getElevatorState().distanceFromFloor(requestedFloor) <= min) {
                min = elevator.getValue().getElevatorState().distanceFromFloor(requestedFloor);
                ansElevator = elevator.getKey();
            }
        }
        return ansElevator;
    }

    public void move(String elevatorId, String action) {
        Elevator elevator = elevators.get(elevatorId);
        elevator.getElevatorState().move(elevator, action);
    }

    public void stopAt(String elevatorId, int floorNumber) {
        Elevator elevator = elevators.get(elevatorId);
        elevator.setCurrentFloor(floorNumber);
        elevator.getElevatorState().stop();
    }

}
