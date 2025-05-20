/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.etec.myproject.teste;

import br.edu.etec.myproject.model.PagamentoCartao;

/**
 *
 * @author Andre
 */
public class TestePagamento {
    public static void main(String[] args) {
        PagamentoCartao pagamento = new PagamentoCartao(150.75, "1234567890123456");

        pagamento.exibirStatus(); // Deve estar PENDENTE
        pagamento.processarPagamento();
        pagamento.exibirStatus(); // Deve estar CONCLUIDO
    }
}

