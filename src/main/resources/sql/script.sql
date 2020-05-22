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

INSERT INTO 
    component 
VALUES 
    (NULL, 'Raspberry 3b+',         'Raspberry 3b+',        43990,  TRUE),
    (NULL, 'Cargador',              'Cargador',             5990,   TRUE),
    (NULL, 'Carcasa Lego',          'Carcasa Lego',         5290,   FALSE),
    (NULL, 'Carcasa Nespicase +',   'Carcasa Nespicase +',  22990,  FALSE),
    (NULL, 'Micro SD 16gb',         'Micro SD 16gb',        4090,   FALSE),
    (NULL, 'Micro SD 32gb',         'Micro SD 32gb',        6290,   FALSE),
    (NULL, 'Micro SD 64gb',         'Micro SD 64gb',        12590,  FALSE),
    (NULL, 'Joystick NjoyTech',     'Joystick NjoyTech',    4990,   FALSE),
    (NULL, 'Joystick 8bitdo',       'Joystick 8bitdo',      27500,  FALSE);

CREATE TABLE pack(
    id          INT AUTO_INCREMENT,
    name        VARCHAR(100),
    description VARCHAR(2000),
    PRIMARY KEY(id)
);

INSERT INTO 
    pack 
VALUES
    (NULL, 'Pack Básico',   'Pack Básico'), 
    (NULL, 'Pack Medio',    'Pack Medio'),
    (NULL, 'Pack Full',     'Pack Full'),
    (NULL, 'Pack Mega',     'Pack Mega');

CREATE TABLE pack_component(
    id              INT AUTO_INCREMENT,
    pack_id         INT,
    component_id    INT,
    quantity        INT,
    PRIMARY KEY(id),
    FOREIGN KEY(pack_id)        REFERENCES pack(id),
    FOREIGN KEY(component_id)   REFERENCES component(id)
);

INSERT INTO 
    pack_component
VALUES
    (NULL, 1, 1, 1),(NULL, 1, 2, 1),(NULL, 1, 3, 1),(NULL, 1, 5, 1),
    (NULL, 2, 1, 1),(NULL, 2, 2, 1),(NULL, 2, 3, 1),(NULL, 2, 6, 1),(NULL, 2, 8, 2),
    (NULL, 3, 1, 1),(NULL, 3, 2, 1),(NULL, 3, 5, 1),(NULL, 3, 7, 1),(NULL, 3, 8, 2),
    (NULL, 4, 1, 1),(NULL, 4, 2, 1),(NULL, 4, 5, 1),(NULL, 4, 7, 1),(NULL, 4, 9, 2);

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

-- Listado de packs y sus componentes
SELECT 
    pack.*,
    component.*,
    pack_component.quantity
FROM   
    pack
    LEFT JOIN pack_component    ON pack_component.pack_id = pack.id
    LEFT JOIN component         ON component.id = pack_component.component_id;


DROP DATABASE buildProduct;