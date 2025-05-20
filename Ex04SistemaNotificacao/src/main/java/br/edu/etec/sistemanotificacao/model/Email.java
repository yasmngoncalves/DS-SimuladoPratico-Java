/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.etec.sistemanotificacao.model;

/**
 *
 * @author yasmn
 */
public class Email extends Notificacao {
    public Email(String destinatario, String mensagem) {
        super(destinatario, mensagem, TipoNotificacao.EMAIL);
    }

    @Override
    public void enviar() {
        System.out.println("Enviando EMAIL para " + destinatario + ": " + mensagem);
    }
}
