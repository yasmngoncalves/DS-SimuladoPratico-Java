/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.etec.myproject.model;

/**
 *
 * @author Andre
 */
public class PagamentoCartao extends Pagamento {
    private String numeroCartao;

    public PagamentoCartao(double valor, String numeroCartao) {
        super(valor);
        this.numeroCartao = numeroCartao;
    }

    @Override
    public void processarPagamento() {
        System.out.println("Processando pagamento com cartão...");
        status = StatusPagamento.CONCLUIDO;

        // Exibir os 4 últimos dígitos
        if (numeroCartao.length() >= 4) {
            String ultimos4 = numeroCartao.substring(numeroCartao.length() - 4);
            System.out.println("Pagamento realizado com cartão final " + ultimos4);
        } else {
            System.out.println("Número de cartão inválido.");
            status = StatusPagamento.FALHA;
        }
    }
}

