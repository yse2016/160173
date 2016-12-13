public class Aloha{
  public static void main(String[] args){
    boolean flag = true;
    while(flag){
      System.out.println("Type msg , if type msg = 'exit' loop end.");  
      String msg = new java.util.Scanner(System.in).nextLine();
      if(msg.equals("exit")){
        flag = false;
      } else {
        System.out.println(msg);
      }
    }
  }
}
