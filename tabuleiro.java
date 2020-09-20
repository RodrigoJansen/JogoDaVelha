public class tabuleiro{
  char p1='n',p2='n',p3='n',p4='n',p5='n',p6='n',p7='n',p8='n',p9='n';


  void marcar(int opção, int jogador){
    if(opção == 1){
          if(jogador == 1){
            p1 = 'x';
          }
          if(jogador == 2){
            p1 = 'o';
          }
        }
        if(opção == 2){
          if(jogador == 1){
            p2 = 'x';
          }
          if(jogador == 2){
            p2 = 'o';
          }
        }
        if(opção == 3){
          if(jogador == 1){
            p3 = 'x';
          }
          if(jogador == 2){
            p3 = 'o';
          }
        }
        if(opção == 4){
          if(jogador == 1){
            p4 = 'x';
          }
          if(jogador == 2){
            p4 = 'o';
          }
        }
        if(opção == 5){
          if(jogador == 1){
            p5 = 'x';
          }
          if(jogador == 2){
            p5 = 'o';
          }
        }
        if(opção == 6){
          if(jogador == 1){
            p6 = 'x';
          }
          if(jogador == 2){
            p6 = 'o';
          }
        }
        if(opção == 7){
          if(jogador == 1){
            p7 = 'x';
          }
          if(jogador == 2){
            p7 = 'o';
          }
        }
        if(opção == 8){
          if(jogador == 1){
            p8 = 'x';
          }
          if(jogador == 2){
            p8 = 'o';
          }
        }
        if(opção == 9){
          if(jogador == 1){
            p9 = 'x';
          }
          if(jogador == 2){
            p9 = 'o';
          }
        }
  }
  void mostrar(){
    System.out.println(p1+","+p2+","+p3+"\n"+p4+","+p5+","+p6+"\n"+p7+","+p8+","+p9);
  }


  public boolean terminar(){
    boolean acabar = false;
    if((p1 == p2 && p2 == p3 && p1 == 'x') || (p4 == p5 && p5 == p6 && p5 == 'x') || (p7 == p8 && p8 == p9 && p7 == 'x') || (p1 == p4 && p4 == p7 && p1 == 'x') || (p2 == p5 && p5 == p8 && p2 == 'x') || (p3 == p6 && p6 == p9 && p3 == 'x') || (p1 == p5 && p5 == p9 && p1 == 'x') || (p3 == p5 && p5 == p7 && p3 == 'x')){
      System.out.println("Vitória do jogador 1");
      acabar = true;
      return acabar;
    }

    else if((p1 == p2 && p2 == p3 && p1 == 'o') || (p4 == p5 && p5 == p6 && p5 == 'o') || (p7 == p8 && p8 == p9 && p7 == 'o') || (p1 == p4 && p4 == p7 && p1 == 'o') || (p2 == p5 && p5 == p8 && p2 == 'o') || (p3 == p6 && p6 == p9 && p3 == 'o') || (p1 == p5 && p5 == p9 && p1 == 'o') || (p3 == p5 && p5 == p7 && p3 == 'o')){
      System.out.println("Vitória do jogador 2");
      acabar = true;
      return acabar;
    }

    else if(p1!='n' && p2!='n' && p3!='n' && p4!='n' && p5!='n' && p6!='n' && p7!='n' && p8!='n' && p9!='n'){
      System.out.println("Deu velha!");
      acabar = true;
      return acabar;
    }
    return false;
  }
}