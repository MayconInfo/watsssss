
package Exemplos;

public class Televisao {
     public String tela;
  public int polegada;
  public String preco ;
  public String nome;
  
  
  public void ligar(){
    System.out.println("Televisão Ligada");
 
}
  public void impDados(){
    System.out.println("Sua tela é "+this.tela);
    System.out.println("Seu preço é "+this.preco);
    System.out.println("Suas polegadas são "+this.polegada);
    System.out.println("Sua Marca é "+this.nome);
    
     
    }
}
