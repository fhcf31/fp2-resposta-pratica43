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
public class Elipse implements FiguraComEixos {
    private double eixoX = 0;
    private double eixoY = 0;
    String nome;
    
    public Elipse(double eixoX,double eixoY,String nome){
        this.eixoX = eixoX;
        this.eixoY = eixoY;
        this.nome = nome;
    }
    public String getNome(){
        return nome;
    }
    
    @Override
    public double getArea(){
        return Math.PI*eixoX*eixoY;
    }
    
    public double getPerimetro(){
        return Math.PI*(3*(eixoX+eixoY) - Math.sqrt((3*eixoX+eixoY)*(eixoX+3*eixoY)));
    }
    
    public double getEixoMenor(){
        if(eixoX > eixoY)
            return eixoX;
        else
            return eixoY;
    }
    
    public double getEixoMaior(){
        if(eixoY > eixoX)
            return eixoY;
        else
            return eixoX;
    }
}