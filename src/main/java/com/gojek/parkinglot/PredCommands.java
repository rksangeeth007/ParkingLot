package com.gojek.parkinglot;

import java.lang.reflect.Method;
import java.util.Map;
import java.util.HashMap;

public class PredCommands {
    public Map<String, Method> commandsMap;

    public PredCommands() {
        commandsMap = new HashMap<String, Method>();
        try {
            populateCommandsHashMap();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }
    private void populateCommandsHashMap() throws NoSuchMethodException {
        commandsMap.put("create_parking_lot", ParkingService.class.getMethod("createParkingLot", String.class));
        commandsMap.put("park", ParkingService.class.getMethod("park", String.class, String.class));
        commandsMap.put("leave", ParkingService.class.getMethod("leave", String.class));
        commandsMap.put("status", ParkingService.class.getMethod("status"));
        commandsMap.put("registration_numbers_for_cars_with_colour", ParkingService.class.getMethod("getRegistrationNumbersFromColor", String.class));
        commandsMap.put("slot_numbers_for_cars_with_colour", ParkingService.class.getMethod("getSlotNumbersFromColor", String.class));
        commandsMap.put("slot_number_for_registration_number", ParkingService.class.getMethod("getSlotNumberFromRegNo", String.class));
    }
}
