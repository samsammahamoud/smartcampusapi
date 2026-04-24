/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.smartcampusapi1;

/**
 *
 * @author huda
 */


import jakarta.ws.rs.*;
import jakarta.ws.rs.core.*;
import java.util.*;

@Path("/")
@Produces(MediaType.APPLICATION_JSON)
public class DiscoveryResource {

    @GET
    public Response getDiscovery() {

        Map<String, Object> response = new HashMap<>();

        response.put("apiName", "Smart Campus Sensor & Room Management API");
        response.put("version", "1.0");
        response.put("contact", "samsam.abdirashid@hotmail.com");

        Map<String, String> links = new HashMap<>();
        links.put("rooms", "/api/v1/rooms");
        links.put("sensors", "/api/v1/sensors");
        links.put("sensorReadings", "/api/v1/sensors/{sensorId}/readings");

        response.put("links", links);

        return Response.ok(response).build();
    }
}
