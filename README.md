README: Music Management System
Project Overview
A Java-based application for managing a music library, implementing core Object-Oriented Programming (OOP) principles, a layered architecture, and PostgreSQL database integration.

Technical Features
OOP Principles: Utilization of Inheritance, Abstraction (Abstract Classes), and Polymorphism.

Layered Architecture: Clear separation between Controller, Service, Repository, and Model layers.

Database Integration: Persistent storage using PostgreSQL with JDBC (Singleton pattern).

Generics & Interfaces: Implementation of a generic CRUD repository interface.

Functional Programming: Data sorting using Lambda expressions.

Reflection (RTTI): Runtime class inspection for metadata analysis.

Exception Handling: Custom exception hierarchy for input validation and resource management.

Database Schema
The system requires two related tables in PostgreSQL:

SQL
CREATE TABLE genres (
    id SERIAL PRIMARY KEY,
    name VARCHAR(100) NOT NULL UNIQUE
);

CREATE TABLE media_contents (
    id SERIAL PRIMARY KEY,
    title VARCHAR(255) NOT NULL,
    duration INT NOT NULL,
    genre_id INT NOT NULL,
    type VARCHAR(50) NOT NULL,
    extra_info VARCHAR(255),
    CONSTRAINT fk_genre FOREIGN KEY (genre_id) REFERENCES genres(id)
);
Installation and Setup
Database Configuration: Ensure PostgreSQL is running. Update the url, user, and password in src/utils/DatabaseConnection.java.

Dependencies: Add the PostgreSQL JDBC Driver (postgresql-42.x.x.jar) to the project libraries.

Compilation: Compile all source files starting from the Main.java entry point.

Execution: Run the Main class to initialize the system and perform runtime inspection.

Project Structure
controller: Handles user interaction and flow control.

service: Contains business logic and validation.

repository: Manages database operations (CRUD).

model: Defines entities (Song, Podcast) and base classes.

utils: Contains database connection, reflection tools, and sorting logic.

exception: Custom exception classes.

interfaces: Core functional and validation interfaces.

Project Credits
Developed as part of the Object-Oriented Programming Course.
