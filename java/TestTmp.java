public class TestTmp{
	public static void main(String[] args) {
		introduceOneself(args[0],Integer.parseInt(args[1]),Double.parseDouble(args[2]),args[3]);
	}
	
	public static void introduceOneself(String name,int age,double height,String gender) {
		System.out.println("私の名前は" + name + "です。");
		System.out.println("歳は" + age + "です。");
		System.out.println("身長は" + height + "cmです。");
		System.out.println("性別は" + gender + "です。");
	}
}