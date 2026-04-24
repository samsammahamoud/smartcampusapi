/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.smartcampusapi1;

/**
 *
 * @author Samsam Mahamoud w1904432
 */


import jakarta.ws.rs.*;
import jakarta.ws.rs.core.*;
import java.util.*;

@Path("/sensors")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class SensorResource {

    @GET
    public Response getAllSensors(@QueryParam("type") String type) {
        List<Sensor> allSensors = new ArrayList<>(DataStore.sensors.values());

        if (type != null && !type.isEmpty()) {
            List<Sensor> filtered = new ArrayList<>();

            for (Sensor sensor : allSensors) {
                if (sensor.getType() != null && sensor.getType().equalsIgnoreCase(type)) {
                    filtered.add(sensor);
                }
            }

            return Response.ok(filtered).build();
        }

        return Response.ok(allSensors).build();
    }

    @POST
    public Response createSensor(Sensor sensor) {
        Room room = DataStore.rooms.get(sensor.getRoomId());

        if (room == null) {
            return Response.status(Response.Status.BAD_REQUEST)
                    .entity("Room does not exist")
                    .build();
        }

        DataStore.sensors.put(sensor.getId(), sensor);

        room.getSensorIds().add(sensor.getId());

        return Response.status(Response.Status.CREATED).entity(sensor).build();
    }

    @GET
    @Path("/{sensorId}")
    public Response getSensorById(@PathParam("sensorId") String sensorId) {
        Sensor sensor = DataStore.sensors.get(sensorId);

        if (sensor == null) {
            return Response.status(Response.Status.NOT_FOUND)
                    .entity("Sensor not found")
                    .build();
        }

        return Response.ok(sensor).build();
    }
    
    @Path("/{sensorId}/readings")
    public SensorReadingResource getSensorReadingResource(@PathParam("sensorId") String sensorId) {
    return new SensorReadingResource(sensorId);
}
}