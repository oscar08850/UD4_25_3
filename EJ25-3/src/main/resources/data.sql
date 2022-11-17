DROP table IF EXISTS almacenes;
DROP table IF EXISTS cajas;

create table almacenes(
	id int auto_increment PRIMARY KEY,
	lugar varchar(100),
	capacidad int
	);

create table cajas(
	num_referencia varchar(5) PRIMARY KEY,
	contenido varchar(100),
	valor varchar (100),
	almacen_id int,
    FOREIGN KEY (almacen_id) REFERENCES almacenes(id) ON DELETE CASCADE ON UPDATE CASCADE 
    );
    


insert into almacenes (lugar,capacidad) values('Almacen 1' , 10000);
insert into almacenes (lugar,capacidad) values('Almacen 2' , 20000);
insert into almacenes (lugar,capacidad) values('Almacen 3' , 30000);
insert into almacenes (lugar,capacidad) values('Almacen 4' , 40000);
insert into almacenes (lugar,capacidad) values('Almacen 5' , 50000);



insert into cajas (num_referencia, contenido, valor, almacen_id) values('1111A','Pedro', '123', 1);
insert into cajas (num_referencia, contenido, valor, almacen_id) values('2222B','Mariano', '5432', 2);
insert into cajas (num_referencia, contenido, valor, almacen_id) values('3333C','Pablo', '632', 3);
insert into cajas (num_referencia, contenido, valor, almacen_id) values('4444D','Juan', '12431', 2);
