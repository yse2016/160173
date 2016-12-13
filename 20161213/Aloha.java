public class Aloha{
  public static void main(String[] args){
    // String Msg0 = args[0];
    // String Msg1 = args[1];

    System.out.println("Type mainMsg.");
    String mainMsg = new java.util.Scanner(System.in).nextLine();
    System.out.println("Type subMsg.");
    String subMsg  = new java.util.Scanner(System.in).nextLine();

    System.out.println(mainMsg);
    System.out.println(subMsg);

    /* for(int i=0; i<20; i++){
      if( i%3 == 0 ){
	System.out.println(mainMsg);
      } else {
        System.out.println(subMsg);
      }
    } */
  }
}
