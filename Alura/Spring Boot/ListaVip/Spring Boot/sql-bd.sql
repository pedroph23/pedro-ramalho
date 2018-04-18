create database bd_listavip;
use bd_listavip;
create table tb_convidado(id int primary key not null auto_increment
						,nome varchar(250)
						,email varchar(500)
						,telefone varchar(500));
                      
                      
                      
insert into tb_convidado(nome,email,telefone) values ('Lazaro Prates Junior','lazaro@alura.com.br','99998888');
insert into tb_convidado(nome,email,telefone) values ('Maria do Carmo','maria@gmail.com','33442233');
insert into tb_convidado(nome,email,telefone) values ('Antonio daSilva','toni@alura.com.br','99997777');


select * from tb_convidado;
delete from tb_convidado where id>0;
drop table tb_convidado;