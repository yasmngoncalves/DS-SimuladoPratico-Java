/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package br.edu.etec.myproject.teste;

import br.edu.etc.myproject.model.Animal;
import br.edu.etc.myproject.model.Arara;
import br.edu.etc.myproject.model.Golfinho;
import br.edu.etc.myproject.model.Leao;

/**
 *
 * @author Andre
 */
public class TesteZoologico {
    public static void main(String[] args) {
        Animal leao = new Leao("Simba", 5);
        Animal golfinho = new Golfinho("Flipper", 8);
        Animal arara = new Arara("Lola", 2);

        System.out.println("=== LEÃO ===");
        leao.exibirInfo();
        leao.emitirSom();

        System.out.println("\n=== GOLFINHO ===");
        golfinho.exibirInfo();
        golfinho.emitirSom();

        System.out.println("\n=== ARARA ===");
        arara.exibirInfo();
        arara.emitirSom();
    }
}
