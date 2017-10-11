/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.rj.macae.femass.dsi.p1.controle;

import br.rj.macae.femass.ds1.p1.dao.AlunoDAO;
import br.rj.macae.femass.ds1.p1.model.Aluno;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author JoaoPedroThedin
 */
public class AlunoControle {
    public void gravar(Aluno a)throws SQLException{
        AlunoDAO dao = new AlunoDAO();
        try{
        if(a.getId()==null || a.getId()<=0)
            dao.adicionar(a);
        else
            dao.alterar(a);
        }catch(SQLException ex){
            throw new SQLException("Erro ao salvar as informações: \n"+ex.getMessage());
        }
    }
    
  public List<Aluno> listarAlunos() throws SQLException{
        return null;
      
     //return AlunoDAO.listarAlunos(); 
     
     //Ana, comentei essa linha de código por nao entender o motivo pelo qual o relacionamento nao esta funcinando. 
     //Ja tenho o metodo cirado em AlunoDao e agora estou vinculando-o ao controle, mas a vinculadcao nao aparece de maneira alguma. Tambem ja realizei  a chamada do mesmo na Gui.
  }
}
          
          
          
          

//return daoCliente.listarTodos();
    
    
  
