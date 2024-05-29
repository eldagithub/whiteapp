# Spring Boot Postgres Actuator Example

## Description
This project is a Spring Boot application that connects to a PostgreSQL database and includes Spring Boot Actuator for monitoring. It is packaged as a `.war` file for deployment on a Tomcat server.

## Setup Instructions
export JAVA_HOME=$HOME/java/jdk-22.0.1.jdk/Contents/Home
export PATH=$JAVA_HOME/bin:$PATH



1. **Database Setup**:
    - Ensure you have PostgreSQL installed and running.
    - Create a new database.
    - Run the SQL script provided (`setup.sql`) to create the `Person` table and insert example data.

2. **Application Configuration**:
    - Update the `src/main/resources/application.properties` file with your PostgreSQL database connection details:
      ```properties
      spring.datasource.url=jdbc:postgresql://localhost:5432/your_database_name
      spring.datasource.username=your_username
      spring.datasource.password=your_password
      ```

3. **Build and Deploy**:
    - Use Maven to build the project and generate the `.war` file:
      ```bash
      mvn clean package
      ```
    - Deploy the generated `.war` file to your Tomcat server.

4. **Access Endpoints**:
    - Actuator health endpoint: `http://localhost:8080/your_context_path/actuator/health`
    - Custom database check endpoint: `http://localhost:8080/your_context_path/api/person/checkDb`

## Provided Files

- `pom.xml` : Maven configuration file.
- `src/main/java/com/example/demo` : Java source files.
- `src/main/resources/application.properties` : Spring Boot application properties.
- `setup.sql` : SQL script to set up the database table and insert example data.

## Example Data

The `Person` table will be created with the following columns:
- `id` : Serial primary key.
- `name` : Name of the person.
- `address` : Address of the person.

Example rows inserted:
- John Doe, 123 Elm Street
- Jane Smith, 456 Oak Avenue
- Jim Brown, 789 Pine Road
- Jack White, 101 Maple Blvd
