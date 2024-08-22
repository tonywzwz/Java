/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package com.mycompany.mavenproject2;

/**
 *
 * @author Aluno
 */
public enum UnidadeFederativa {
    
    BAHIA("bahia", "ba"),
    SAO_PAULO("são paulo", "sp");
    RIO_DE_JANEIRO("rio de janeiro", "rj");
    
    private String nome;
    private String sigla;

    private UnidadeFederativa(String nome, String sigla) {
        this.nome = nome;
        this.sigla = sigla;
    }

    public String getNome() {
        return nome;
    }

    public String getSigla() {
        return sigla;
    }

    
    
}
