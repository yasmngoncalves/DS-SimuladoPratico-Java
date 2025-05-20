/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package br.edu.etec.sistemadeusuario.teste;

import br.edu.etec.sistemadeusuario.model.NivelAcesso;
import br.edu.etec.sistemadeusuario.model.Usuario;

/**
 *
 * @author yasmn
 */
public class TesteUsuario {

     public static void main(String[] args) {
        // Criando um usuário ADMIN
        Usuario admin = new Usuario("yasmin", "senha123", NivelAcesso.ADMIN);

        // Testando autenticação com senha correta
        boolean autenticado = admin.autenticar("senha123");

        System.out.println("Usuario autenticado? " + autenticado);
        System.out.println("Nivel de acesso: " + admin.getNivel());
    }
}
