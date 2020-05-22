CREATE DATABASE buildProduct;

USE buildProduct;

CREATE TABLE component(
    id          INT AUTO_INCREMENT,
    name        VARCHAR(100),
    description VARCHAR(2000),
    price       FLOAT,
    base        BOOLEAN,
    PRIMARY KEY(id)
);

CREATE TABLE pack(
    id          INT AUTO_INCREMENT,
    name        VARCHAR(100),
    description VARCHAR(2000),
    PRIMARY KEY(id)
);

CREATE TABLE pack_component(
    id              INT AUTO_INCREMENT,
    pack_id         INT,
    component_id    INT,
    PRIMARY KEY(id),
    FOREIGN KEY(pack_id)        REFERENCES pack(id),
    FOREIGN KEY(component_id)   REFERENCES component(id)
);

CREATE TABLE client(
    id              INT AUTO_INCREMENT,
    name            VARCHAR(100),
    phone_number    VARCHAR(50),
    mail            VARCHAR(200),
    PRIMARY KEY(id)
);

CREATE TABLE client_pack(
    id          INT AUTO_INCREMENT,
    client_id   INT,
    pack_id     INT,
    PRIMARY KEY(id),
    FOREIGN KEY(client_id)  REFERENCES client(id),
    FOREIGN KEY(pack_id)    REFERENCES pack(id)
);

SELECT * FROM component;
SELECT * FROM pack;
SELECT * FROM pack_component;
SELECT * FROM client;
SELECT * FROM client_pack;

DROP DATABASE buildProduct;