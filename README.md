- Name: Samsam Mahamoud
- Student ID: w1904432

## Project Description
This project is a RESTful API developed in Java for managing a Smart Campus system.  
It allows users to manage rooms, sensors, and sensor readings within a campus environment.

## Technologies Used
- Java
- JAX-RS (Jakarta RESTful Web Services)
- Maven
- NetBeans
- Postman

## Features
- Create and retrieve rooms
- Create sensors and assign them to rooms
- Retrieve sensor readings
- Custom exception handling
- API request logging

### Rooms
- `GET /api/v1/rooms` - Get all rooms
- `POST /api/v1/rooms` - Create a new room

### Sensors
- `GET /api/v1/sensors` - Get all sensors
- `POST /api/v1/sensors` - Create a sensor

### Sensor Readings
- `GET /api/v1/sensors/{sensorId}/readings` - Get readings for a sensor
- `POST /api/v1/sensors/{sensorId}/readings` - Add a reading to a sensor

## How to Run the Project
1. Open the project in NetBeans.
2. Run `MainServer.java`.
3. The API will start at:
http://localhost:8080/api/v1
