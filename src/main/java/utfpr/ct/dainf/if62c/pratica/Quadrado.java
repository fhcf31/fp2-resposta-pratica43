/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utfpr.ct.dainf.if62c.pratica;

/**
 *
 * @author Fernando
 */
public class Quadrado implements FiguraComLados{
    private double lado;
    private String nome;
    
    public Quadrado(double lado, String nome){
        this.lado = lado;
        this.nome = nome;
    }
    
    @Override
    public double getLadoMaior(){
        return lado;
    }
    @Override
    public double getLadoMenor(){
        return lado;
    }
    @Override
    public double getArea(){
        return lado*lado;
    }
    @Override
    public double getPerimetro(){
        return 4*lado;
    }
    @Override
    public String getNome(){
        return nome;
    }
}
