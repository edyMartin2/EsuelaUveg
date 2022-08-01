use Escuela;

drop table if exists User;

create table User (
    id int AUTO_INCREMENT not null primary key,
    Nombre varchar(255),
    Apellido varchar(2 55),
    Correo varchar(255)
);

