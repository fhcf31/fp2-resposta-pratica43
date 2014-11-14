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
public class Retangulo implements FiguraComLados{
    private double lado1;
    private double lado2;
    private String nome;
    
    public Retangulo(double lado1,double lado2, String nome){
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.nome = nome;
    }
    
    @Override
    public double getLadoMaior(){
        if (lado1 > lado2)
            return lado1;
        else
            return lado2;
    }
    @Override
    public double getLadoMenor(){
        if (lado1 < lado2)
            return lado1;
        else
            return lado2;
    }
    @Override
    public double getArea(){
        return lado1*lado2;
    }
    @Override
    public double getPerimetro(){
        return ((2*lado1)+(2*lado2));
    }
    @Override
    public String getNome(){
        return nome;
    }
}
