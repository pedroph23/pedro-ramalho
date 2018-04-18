package br.com.alura.enviadorEmail;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.Email;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;
import org.springframework.stereotype.Service;

/**
 * Created by pedro-ramalho on 16/04/18.
 */

@Service
public class EmailService {


    public void enviar(String nome, String emailConvidado) {

        Email email = new SimpleEmail();

        try {
            //CONFG DE EMAIL
            email.setHostName("smtp.googlemail.com");//servico de email a sua escolha
            email.setSmtpPort(465);//porta de envio
            email.setAuthenticator(new DefaultAuthenticator("phgr123@gmail.com", "mosquito1997"));//Autenticador de email e senha
            email.setSSLOnConnect(true);//Ativar a conexao

            //CONFG EM ENVIO
            email.setFrom("phgr123@gmail.com");//email do remetente
            email.setSubject("Você foi convidado para ListaVIP");//descricao
            email.setMsg("Olá" + nome + ". Você acaba de ser convidado pelo ListaVIP.");//mensagem
            email.addTo(emailConvidado);//para que vc mandar(destinatário)
            email.send();//enviar..

        } catch (EmailException e) {
            e.printStackTrace();
        }
    }



    }


