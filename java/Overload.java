public class Overload{
	public static void main(String[] args) {
		OverloadMan om = new OverloadMan();
		om.sayAloha();
		om.sayAloha("Aoki");
		om.sayAloha(10);
		om.sayAloha(10,4,"あおき");
	}
}//class Overload

	class OverloadMan{
		private String nameK;
		private String nameH;
		private int numRepeat;
		private int numSpecial; 

			public void sayAloha(){
				System.out.println("Aloha!");
			}

			public void sayAloha(String nameK){
				System.out.println(nameK+"Aloha!");
			}

			public void sayAloha(int numRepeat){
				for(int i=0;i<numRepeat;i++){
				System.out.println(i+":Aloha!");
				}
			}

			public void sayAloha(int numRepeat,int numSpecial,String nameH){
				for (int i=0;i<numRepeat;i++ ) {
					if (i%numSpecial==0) {
						System.out.println(i+nameH+"あろは！");
					}else{
						System.out.println(i+nameH+"Aloha!");
					}
				}
			}
	}//OverloadMan