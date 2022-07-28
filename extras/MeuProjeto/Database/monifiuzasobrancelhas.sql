Create database meuprojeto;

use meuprojeto;

create table Usuario(
	id int not null primary key auto_increment,
	usuario varchar(30) not null,
	senha varchar(30) not null
	);

create table Procedimento(
	id int not null primary key auto_increment,
	nome varchar(30) not null,
	preco decimal(4,2) not null,
	situacao varchar(30) not null
	);

create table Cliente(
	id int not null primary key auto_increment,
	nome varchar(50) not null,
	cpf varchar(14) not null,
	celular varchar(13) not null,
	obs varchar(70) null
	);

create table Agendamento(
	id int not null primary key auto_increment,
	id_cliente int not null,
	data varchar(10) not null,
	hora varchar(5) not null,
	procedimento varchar(30) not null,
	precoProcedimento decimal(5,2) not null,
	procedimento2 varchar(30) null,
	precoProcedimento2 decimal(5,2) null,
	local varchar(20) not null,
	precoLocal decimal(5,2) not null,
	obs varchar(70) null,
	precoTotal decimal(5,2),
	Foreign Key (id_cliente) References Cliente(id)
	);


insert into usuario(usuario, senha) values('wes', 'wes'), ('admin', 'Bento');