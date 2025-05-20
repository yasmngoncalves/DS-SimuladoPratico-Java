/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.etec.sistemanotificacao.model;

/**
 *
 * @author yasmn
 */
public class SMS extends Notificacao {
     public SMS(String destinatario, String mensagem) {
        super(destinatario, mensagem, TipoNotificacao.SMS);
    }

    @Override
    public void enviar() {
        String textoFinal = mensagem.length() > 160 ? mensagem.substring(0, 160) : mensagem;
        System.out.println("Enviando SMS para " + destinatario + ": " + textoFinal);
    }
}
