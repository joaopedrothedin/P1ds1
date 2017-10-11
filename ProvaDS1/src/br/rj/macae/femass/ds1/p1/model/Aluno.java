/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.rj.macae.femass.ds1.p1.model;

/**
 *
 * @author JoaoPedroThedin
 */
public class Aluno {
    
    private Long id;
    private String nome;
    private Integer idade;
    private Float massa;
    private Float Estatura;
    private String Sexo;

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the idade
     */
    public Integer getIdade() {
        return idade;
    }

    /**
     * @param idade the idade to set
     */
    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    /**
     * @return the massa
     */
    public Float getMassa() {
        return massa;
    }

    /**
     * @param massa the massa to set
     */
    public void setMassa(Float massa) {
        this.massa = massa;
    }

    /**
     * @return the Estatura
     */
    public Float getEstatura() {
        return Estatura;
    }

    /**
     * @param Estatura the Estatura to set
     */
    public void setEstatura(Float Estatura) {
        this.Estatura = Estatura;
    }

    /**
     * @return the Sexo
     */
    public String getSexo() {
        return Sexo;
    }

    /**
     * @param Sexo the Sexo to set
     */
    public void setSexo(String Sexo) {
        this.Sexo = Sexo;
    }

    /**
     * @return the id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Long id) {
        this.id = id;
    }
    
        public Float getImc()
    {
        return  massa/(Estatura*Estatura);
             
            
    }
 
    
}
