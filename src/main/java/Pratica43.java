/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Fernando
 */
import utfpr.ct.dainf.if62c.pratica.Figura;
import utfpr.ct.dainf.if62c.pratica.Circulo;
import utfpr.ct.dainf.if62c.pratica.Elipse;
import utfpr.ct.dainf.if62c.pratica.Quadrado;
import utfpr.ct.dainf.if62c.pratica.Retangulo;
import utfpr.ct.dainf.if62c.pratica.TrianguloEquilatero;

public class Pratica43 {
    public static void main(String[] args) {
        Figura[] figuras = new Figura[5];
        
        figuras[0] = new Circulo(4.3,"CIRCULO");
        figuras[1] = new Elipse(1.2,2.2,"ELIPSE");
        figuras[2] = new Quadrado(4.6,"QUADRADO");
        figuras[3] = new Retangulo(5.4,8.9,"RETANGULO");
        figuras[4] = new TrianguloEquilatero(4.8,"TRIANGULO EQUILATERO");
        
        System.out.println("\tCalculos:\n");
        System.out.println(figuras[0].getNome()+" tem as propriedades:\nÁrea: "+figuras[0].getArea()+" Perimetro: "+figuras[0].getPerimetro()+"\n");
        System.out.println(figuras[1].getNome()+" tem as propriedades:\nÁrea: "+figuras[1].getArea()+" Perimetro: "+figuras[1].getPerimetro()+"\n");
        System.out.println(figuras[2].getNome()+" tem as propriedades:\nÁrea: "+figuras[2].getArea()+" Perimetro: "+figuras[2].getPerimetro()+"\n");
        System.out.println(figuras[3].getNome()+" tem as propriedades:\nÁrea: "+figuras[3].getArea()+" Perimetro: "+figuras[3].getPerimetro()+"\n");
        System.out.println(figuras[4].getNome()+" tem as propriedades:\nÁrea: "+figuras[4].getArea()+" Perimetro: "+figuras[4].getPerimetro()+"\n");
    }
}