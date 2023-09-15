create database practica2;

use practica2;

CREATE TABLE Trabajadores (
    no_Control INT PRIMARY KEY,
    nombre VARCHAR(25),
    domicilio VARCHAR(30),
    ciudad VARCHAR(15),
    edad INT,
    oficio VARCHAR(15)
);

INSERT INTO Trabajadores (no_Control, nombre, domicilio, ciudad, edad, oficio)
VALUES
    (012, 'Pedro', 'Lopez', 'Manzanita', 100, 'estudiante'),
    (032, 'José', 'Rodriguez', 'Melon 23-4', 20, 'Abogado'),
    (054, 'Juan', 'Jimenez', 'Lechuga', 987, 'Abogado'),
    (078, 'Mario', 'Vazquez A. L.', 'Mandarina', 2345, 'estudiante'),
    (029, 'Adolfo', 'Alvarez', 'Jamaica', 199, 'Abogado'),
    (090, 'Alissa', 'Sandoval', 'Guayaba', 987, 'Secretaria'),
    (073, 'Sandra', 'Medina.', 'Rio fresa', 200, 'Secretaria'),
    (099, 'Carmen', 'Garcia A. 1.', 'Limones', 234, 'Secretaria'),
    (034, 'Rocio Ortiz Pina', '987', 'Tecate', 20, 'estudiante');