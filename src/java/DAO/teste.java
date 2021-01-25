/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import br.com.base.model.Cadastro;
import java.sql.SQLException;

/**
 *
 * @author rafa_
 */
public class teste {
    
    public static void main(String[] args) {
        Cadastro c = new Cadastro();
        CadastroDAO dao = new CadastroDAO();
        
        c.setNome("Rafael");
        c.setEndereco("Rua Boleeiro");
        c.setTelefone(1234);
        c.setEmail("rafael@hotmail.com");
        
        dao.adicionar(c);
        
    }
    
    
}
