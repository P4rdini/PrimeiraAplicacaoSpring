/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import br.com.base.model.Cadastro;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author rafa_
 */
public class CadastroDAO {
    
    public void adicionar(Cadastro cadastro){
        try {
            
        Conexao con = new Conexao();
        
        String sql="insert into Cadastro (nome,endereco,telefone,email) value (?,?,?,?)";
        
        PreparedStatement pst = con.getConexao().prepareStatement(sql);
        
        pst.setString(1, cadastro.getNome());
        pst.setString(2, cadastro.getEndereco());
        pst.setInt(3, cadastro.getTelefone());
        pst.setString(4,cadastro.getEmail());
        
        pst.execute();
        } catch (Exception e) {
            System.out.println(e);
        }
  
        
        
        
    }
    
    
}
