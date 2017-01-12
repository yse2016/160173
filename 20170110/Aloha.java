public class Aloha{
	public static void main(String[] args){
		Alohaman am = new Alohaman();
		int lon = args.length;

		if(lon == 0){
			am.sayAloha();
		}else if(lon == 1){
			int a = Integer.parseInt( args[0] );
			am.sayAloha(a);
		} else if(lon == 2){
			int a = Integer.parseInt( args[0] );
			int b = Integer.parseInt( args[1] );
			am.sayAloha(a,b);
		} else {
			System.out.println("ERROR :受け付けられるデータは2個までです。");
		}
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
		System.out.println(this.msg);
	}

	public void sayAloha(int n){
		for(int i = 0; i<n; i++){
			System.out.println(this.msg);
		}
	}

	public void sayAloha(int n, int x){
		for(int i = 0; i<n; i++){
			if(i%x == 0){
				System.out.println(this.msg2);
			}else{
				System.out.println(this.msg);
			}
		}
	}
}