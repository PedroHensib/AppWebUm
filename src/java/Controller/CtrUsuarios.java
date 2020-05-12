/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Conexao.ConectaBanco;
import Model.Pais;
import Model.Usuarios;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Rodney
 */
public class CtrUsuarios {
    
    Connection con;
    
    public List<Usuarios> ListarUsuario(Usuarios p)
    {
      List<Usuarios> lista = new ArrayList<Usuarios>();
      //não escreva daqui pra cima  
 String sql = "select * from usuarios where login=? and senha=?";
 PreparedStatement ps;
 con = ConectaBanco.MetodoConexao();
 ps = con.prepareStatement(sql);
      
      
      //não escreva daqui pra baixo
      return lista;
    }           
    
}
