/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.etec.myproject.model;

/**
 *
 * @author Andre
 */
public abstract class Pagamento {
    protected double valor;
    protected StatusPagamento status;

    public Pagamento(double valor) {
        this.valor = valor;
        this.status = StatusPagamento.PENDENTE;
    }

    public abstract void processarPagamento();

    public void exibirStatus() {
        System.out.println("Status do pagamento: " + status);
    }
}
