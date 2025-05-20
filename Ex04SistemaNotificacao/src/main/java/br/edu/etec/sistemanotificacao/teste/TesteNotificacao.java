/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package br.edu.etec.sistemanotificacao.teste;

import br.edu.etec.sistemanotificacao.model.Notificacao;
import br.edu.etec.sistemanotificacao.model.SMS;
import br.edu.etec.sistemanotificacao.model.Email;
import br.edu.etec.sistemanotificacao.model.Push;

/**
 *
 * @author yasmn
 */
public class TesteNotificacao {

    public static void main(String[] args) {
        Notificacao[] notificacoes = new Notificacao[4];

        notificacoes[0] = new Email("yasmin@email.com", "Voce tem uma nova mensagem!");
        notificacoes[1] = new SMS("11999999999", "Seu codigo de verificacao e 123456.");
        notificacoes[2] = new SMS("11888888888", "Mensagem muito longaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        notificacoes[3] = new Push("UsuarioApp", "Notificacao de atualizacao disponivel!");
        
        for (Notificacao n : notificacoes) {
            n.preparar();
            n.enviar();
            System.out.println("Tipo: " + n.tipo);
            System.out.println("----------");
        }
    }
}
