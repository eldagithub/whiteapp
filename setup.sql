CREATE TABLE Person (
    id SERIAL PRIMARY KEY,
    name VARCHAR(255),
    address VARCHAR(255)
);

INSERT INTO Person (name, address) VALUES ('John Doe', '123 Elm Street');
INSERT INTO Person (name, address) VALUES ('Jane Smith', '456 Oak Avenue');
INSERT INTO Person (name, address) VALUES ('Jim Brown', '789 Pine Road');
INSERT INTO Person (name, address) VALUES ('Jack White', '101 Maple Blvd');
