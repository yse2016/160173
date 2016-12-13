public class Aloha{
  public static void main(String[] args){
    String mainMsg = args[0];
    String subMsg = args[1];

    for(int i=0; i<20; i++){
      if( i%3 == 0 ){
	System.out.println(mainMsg);
      } else {
        System.out.println(subMsg);
      }
    }
  }
}
