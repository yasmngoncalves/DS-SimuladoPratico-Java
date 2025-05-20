/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.etec.myproject;

/**
 *
 * @author Andre
 */
public class modelcomputador extends model {
    private String processador;

    public modelcomputador (String nome, String modelo, String processador) {
        super(nome, modelo);
        this.processador = processador;
    }

    @Override
    public void exibirDados() {
        super.exibirDados(); // mostra nome e modelo
        System.out.println("Processador: " + processador);
    }
}
