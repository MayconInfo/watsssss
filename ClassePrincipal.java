
package Exemplos;


public class ClassePrincipal {
    public static void main(String[] args) {
   Lampada L1 = new Lampada();
   
   L1.cor = "Vermelha" ;
   L1.tipo="redonda";
   L1.tensao = 220;
   L1.nome = "philips";
   L1.ligar();
   L1.impDados();
    




//Televisão
Televisao T1 = new Televisao();

T1.tela = "plana" ;
T1.polegada = 50;
T1.preco = "2.990,00R$";
T1.nome = "Samsung";
T1.ligar();
T1.impDados();
    }
}