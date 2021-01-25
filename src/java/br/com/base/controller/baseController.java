/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.base.controller;

import DAO.CadastroDAO;
import br.com.base.model.Cadastro;
import java.sql.SQLException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;


/**
 *
 * @author rafa_
 */
@Controller
public class baseController extends WebMvcConfigurerAdapter {
    
    @RequestMapping("olamundo")
    public String iniciando(Model model, Cadastro cadastro){
        
        CadastroDAO dao = new CadastroDAO();
        
        System.out.println(cadastro.getEndereco());
        dao.adicionar(cadastro); 
        model.addAttribute("nome",cadastro.getNome());
        
        
        return "index";
    }
    @RequestMapping("/cadastro")
    public String cadastro(){
        return "cadastro";
    }
    
    @Override
    public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
        configurer.enable();
    }
}
