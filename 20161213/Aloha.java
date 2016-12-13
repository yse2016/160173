public class Aloha{
  public static void main(String[] args){
    for(int i=0; i<20; i++){
      if( i%3 == 0 ){
	System.out.println("Hello!");
      } else {
        System.out.println("Aloha!");
      }
    }
  }
}
