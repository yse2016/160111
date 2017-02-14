import java.util.*;

public class TextHashMap2{
	public static void main(String[] args) {
		HashMap<String,Integer> hm = new HashMap<String,Integer>();

		hm.put("ワイ",19);

		int age = hm.get("ワイ");

		System.out.println("args:"+args[0]);

		String t = args[0];

		int num=0;

		if (hm.containsKey(t)) {
			System.out.println("既に存在している");
			num = hm.get(t)+1;
			hm.put(t,num);
		}else{
			System.out.println("存在しません。登録します");
			hm.put(t,1);
			num = hm.get(t);
		}
		System.out.println(t+":"+num);

	}
}