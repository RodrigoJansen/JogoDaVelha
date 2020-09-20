import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    tabuleiro jg = new tabuleiro();
    boolean acabar = false, continuar = true, m[];
    int opção, jogador = 1;
    m = new boolean[10];

    System.out.println("Escolha um valor de 1 a 9\nPara fazer as marcações no tabuleiro\nEscolha 0 para mostrar o tabuleiro");

    while(acabar == false){

    
      System.out.println(jogador +"º escolha um local para marcar");
      opção = ler.nextInt();
      if(opção == 0){
        jg.mostrar();
        continue;
      }
      
      if(m[opção-1] == false){
        jg.marcar(opção,jogador);
        m[opção-1] = true;
        if(jogador == 1){
          jogador = 2;
        }
        else if(jogador == 2){
          jogador =1;
        }
        
      }
      else{
        System.out.println("Essa opção ja foi escolhida");
        }
      acabar = jg.terminar();
    }

  }
}