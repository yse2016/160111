public class Aloha{
	public static void main(String[] args) {
		Alohaman am = new Alohaman();
		int num = args.length;
		if(num==0){
		am.sayAloha();
		}else if(num==1){
		int a = Integer.parseInt(args[0]);
		am.sayAloha(a);
		}else if(num==2){
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		am.sayAloha(a,b);
		}else{
			System.out.println("入力したデータが正しくありません");
			System.out.println("データの数は0～2個でお願いします");
		}
	}
}


class Alohaman{
	private String msg1;
	private String msg2;

	public Alohaman(){
		this.msg1 = "Aloha!";
		this.msg2 = "アロハ！";
	}

	public void sayAloha(){
		System.out.println(this.msg1);
	}

	public void sayAloha(int n){
		for (int i=0;i<n;i++) {
			System.out.println(i+":"+this.msg1);
		}
	}

	public void sayAloha(int n,int x){
		for (int i=0;i<n;i++) {
			if(i%x==0){
				System.out.println(i+":"+this.msg1);
			}else{
				System.out.println(i+":"+this.msg2);

			}
		}
	}
}