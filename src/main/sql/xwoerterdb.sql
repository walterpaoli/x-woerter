create schema xwdb;

create table xwdb.paises (
	id serial not null primary key,
	nombre varchar(50) not null,
	constraint pais_nombre unique(nombre)
);

create unique index paises_nombre_idx on xwdb.paises(nombre);

create table xwdb.idiomas (
	id serial not null primary key,
	nombre varchar(50) not null,
	pais integer not null,
	constraint idioma_pais_fk foreign key (pais) references xwdb.paises(id) 
);

create unique index idiomas_nombre_idx on xwdb.idiomas(nombre);

create table xwdb.palabras (
	id serial not null primary key, 
	palabra varchar(100) not null,
	genero varchar(20),
	idioma integer not null,
	numero varchar(10) not null,
	info_adicional text,
	url varchar(255),
	constraint palabra_idioma_fk foreign key (idioma) references xwdb.idiomas(id)
);

create index palabras_palabra_idx on xwdb.palabras(palabra);

create index palabras_genero_idx on xwdb.palabras(genero);

create index palabras_numero_idx on xwdb.palabras(numero);

create table xwdb.significados (
	id serial not null primary key,
	palabra_origen integer not null,
	palabra_destino integer not null,
	activo integer not null check (activo in (1, 0)),
	fecha_creacion timestamp default now(),
	fecha_modificacion timestamp,
	origen varchar(20) not null,
	url varchar(255),
	constraint palabra_origen_fk foreign key (palabra_origen) references xwdb.palabras(id),
	constraint palabra_destino_fk foreign key (palabra_destino) references xwdb.palabras(id)
);


