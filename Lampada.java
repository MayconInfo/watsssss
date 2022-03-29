
package Exemplos;


public class Lampada {
  public String tipo;
  public double tensao;
  public String cor;
  public String nome;
  

public void ligar(){
    System.out.println("Lampada Ligada");
 
}
  public void impDados(){
    System.out.println("Sua cor é "+this.cor);
    System.out.println("Sua tensão é "+this.tensao);
    System.out.println("Seu tipo é "+this.tipo);
    System.out.println("Sua Marca é "+this.nome);
    
     
    }
 
}