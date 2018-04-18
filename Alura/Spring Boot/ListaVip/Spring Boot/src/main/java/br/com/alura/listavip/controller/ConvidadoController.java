package br.com.alura.listavip.controller;

import br.com.alura.listavip.model.Convidado;
import br.com.alura.listavip.repository.ConvidadoRepository;
import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.Email;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by pedro-ramalho on 01/04/18.
 */
@Controller
public class ConvidadoController {


    @Autowired
    private ConvidadoRepository repository;



    @RequestMapping("/")
    public String index(){
     return "index";
    }

    @RequestMapping("/listavip")
    public String listaConvidados(Model model){

        Iterable<Convidado> convidados = repository.findAll();
        model.addAttribute("convidados",convidados);




        return "listaconvidados";
    }


    @RequestMapping("/adicionarConvidado")
    public String adicionarConvidado(){
        return "adicionar-convidados";
    }

    @RequestMapping(value = "salvar", method = RequestMethod.POST)
    public String salvar(@RequestParam("nome") String nome,@RequestParam("email") String email,@RequestParam("telefone") String telefone,Model model){

         Convidado  novoConvidado = new Convidado(nome,email,telefone);
         repository.save(novoConvidado);//adicionando

        Iterable<Convidado> convidados = repository.findAll();
        model.addAttribute("convidados",convidados);

    while(true) {
        emailService(novoConvidado);
    }




        //return "listaconvidados";

        }



    public void emailService(Convidado convidado){

        Email email = new SimpleEmail();

        try {



            //CONFG DE EMAIL
            email.setHostName("smtp.googlemail.com");//servico de email a sua escolha
            email.setSmtpPort(465);//porta de envio
            email.setAuthenticator(new DefaultAuthenticator("phgr123@gmail.com","mosquito1997"));//Autenticador de email e senha
            email.setSSLOnConnect(true);//Ativar a conexao

            //CONFG EM ENVIO
//            email.setFrom("phgr123@gmail.com");//email do remetente
//            email.setSubject("Você foi convidado para ListaVIP");//descricao
//            email.setMsg("Olá" + convidado.getNome() + ". Você acaba de ser convidado pelo ListaVIP.");//mensagem
//            email.addTo(convidado.getEmail());//para que vc mandar(destinatário)
//            email.send();//enviar..

            email.setFrom("phgr123@gmail.com");//email do remetente
            email.setSubject("Você foi trolado seu puto");//descricao
            email.setMsg("hahahahahahahahahah");//mensagem
            email.addTo(convidado.getEmail());//para que vc mandar(destinatário)
            email.send();//enviar..

            }
        catch(EmailException e){
            e.printStackTrace();
        }
    }


//    @RequestMapping("/sendWpp")
//    public String msgWpp(){
//
//
//        new
//    }
}
