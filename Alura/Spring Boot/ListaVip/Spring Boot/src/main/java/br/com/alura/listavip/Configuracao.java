package br.com.alura.listavip;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;


/**
 * Created by pedro-ramalho on 01/04/18.
 */
@SpringBootApplication
public class Configuracao {

    public static void main(String[] args) {
        SpringApplication.run(Configuracao.class,args);



    }


        //CONEXAO COM O BANCO DE DADOS
        @Bean
        public DataSource dataSource(){

        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://localhost:3306/bd_listavip?autoReconnect=true&useSSL=false");
        dataSource.setUsername("root");
        dataSource.setPassword("phgr1997");

        return dataSource;

    }


}
