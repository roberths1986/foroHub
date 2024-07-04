create table topicos (

    id bigint not null auto_increment,
    titulo varchar(100) not null unique,
    mensaje varchar(1000) not null,
    fecha_de_creacion varchar(100) not null,
    status varchar(100) not null,
    autor varchar(100) not null,
    curso varchar(100) not null,
    primary key(id),
    unique key `unique_mensaje` (mensaje(255))

);