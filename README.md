# Note_Taking_Backend

This is a backend application built using Spring Boot 2.7, configured as a Maven project, and using Java. The application provides a RESTful API for managing notes in a SQL database.

## Features

- Allows creating a new note by sending a POST request to `/notes` with a JSON payload containing the note details.
- Retrieves all notes by sending a GET request to `/notes`.
- Retrieves a single note by its ID by sending a GET request to `/notes/{id}`.

## Prerequisites

- Maven

## Getting Started

1. Clone the repository or download the source code.
2. Open the project in your preferred IDE.
3. Configure the SQL server settings in the `application.properties` file, including the connection URL, username, and password.
4. Build the project using Maven: `mvn clean install`
5. Run the application: `mvn spring-boot:run`

The application will start running on the default port 8080.
