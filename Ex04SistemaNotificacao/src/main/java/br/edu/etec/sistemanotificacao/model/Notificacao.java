/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.etec.sistemanotificacao.model;

/**
 *
 * @author yasmn
 */
public class Notificacao {
    protected String destinatario;
    protected String mensagem;
    public TipoNotificacao tipo;

    public Notificacao(String destinatario, String mensagem, TipoNotificacao tipo) {
        this.destinatario = destinatario;
        this.mensagem = mensagem;
        this.tipo = tipo;
    }

    public void preparar() {
        System.out.println("Preparando notificacao para: " + destinatario);
    }

    public void enviar() {
        System.out.println("Enviando notificacao generica...");
    }
}
