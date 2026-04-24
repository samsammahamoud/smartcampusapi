/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.smartcampusapi1;

/**
 *
 * @author huda
 */


import jakarta.ws.rs.core.UriBuilder;
import org.glassfish.grizzly.http.server.HttpServer;
import org.glassfish.jersey.grizzly2.httpserver.GrizzlyHttpServerFactory;
import org.glassfish.jersey.server.ResourceConfig;

import java.net.URI;

public class MainServer {

    public static void main(String[] args) throws Exception {

        URI baseUri = UriBuilder.fromUri("http://localhost/")
                .port(8080)
                .path("api/v1")
                .build();

        ResourceConfig config = new ResourceConfig()
                .packages("com.mycompany.smartcampusapi1");

        HttpServer server = GrizzlyHttpServerFactory.createHttpServer(baseUri, config);

        System.out.println("Server running at: " + baseUri);
        System.out.println("Press Enter to stop server...");
        System.in.read();

        server.shutdownNow();
    }
}