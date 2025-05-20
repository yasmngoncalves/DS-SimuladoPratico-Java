/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.etec.sistemanotificacao.model;

/**
 *
 * @author yasmn
 */
public class Push extends Notificacao {
    public Push(String destinatario, String mensagem) {
        super(destinatario, mensagem, TipoNotificacao.PUSH);
    }

    @Override
    public void enviar() {
        System.out.println("Enviando PUSH para " + destinatario + ": " + mensagem);
    }
}
