public class Aloha{
	public static void main(String[] args){
		Alohaman am = new Alohaman();
		am.sayAloha();
		am.sayAloha(20);
		am.sayAloha(20,3);
	}
}

class Alohaman{
	// field: データ
	private String msg;
	private String msg2;

	// method: メソッド
	public Alohaman(){
		this.msg = "ALOHA!";
		this.msg2 = "アロハ！";
	}

	public void sayAloha(){
		System.out.println(msg);
	}

	public void sayAloha(int n){
		for(int i = 0; i<n; i++){
			System.out.println(msg);
		}
	}

	public void sayAloha(int n, int x){
		for(int i = 0; i<n; i++){
			if(i%x == 0){
				System.out.println(msg2);
			}else{
				System.out.println(msg);
			}
		}
	}
}