package com.gojek.parkinglot;

import org.junit.Test;

import static org.junit.Assert.*;

public class PredCommandsTest {
    PredCommands predCommands = new PredCommands();
    @Test
    public void checkCommandInList() throws Exception {
        assertFalse(predCommands.commandsMap.isEmpty());
        assertTrue(predCommands.commandsMap.containsKey("create_parking_lot"));
        assertFalse(predCommands.commandsMap.containsKey("mytestcommand"));
    }
}