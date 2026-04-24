/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.smartcampusapi1;

/**
 *
 * @author Samsam Mahamoud w1904432
 */


import java.util.*;

public class DataStore {

    // Store all rooms (roomId → Room)
    public static Map<String, Room> rooms = new HashMap<>();

    // Store all sensors (sensorId → Sensor)
    public static Map<String, Sensor> sensors = new HashMap<>();

    // Store readings (sensorId → list of readings)
    public static Map<String, List<SensorReading>> readings = new HashMap<>();

}
