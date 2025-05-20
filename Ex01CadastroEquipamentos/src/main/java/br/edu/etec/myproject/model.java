/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.etec.myproject;

/**
 *
 * @author Andre
 */
public class model {
    protected String nome;
    protected String modelo;

    public model (String nome, String modelo) {
        this.nome = nome;
        this.modelo = modelo;
    }

    public void exibirDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Modelo: " + modelo);
    }
}

