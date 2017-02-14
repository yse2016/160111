import java.util.*;

public class TextHashMap{
	public static void main(String[] args) {
		HashMap<String,String> hm = new HashMap<String,String>();
		HashMap<String,Integer> hm2 = new HashMap<String,Integer>();

		hm.put("apple","りんご");
		hm2.put("青木",55);

		String data = hm.get("apple");
		System.out.println(data);

		int data2 = hm2.get("青木");
		System.out.println("aoki:"+data2);
		System.out.println("Jennifer:"+data2);

		if (hm2.containsKey("Jennifer")) {
			System.out.println("Jenniferは登録されていない");
			data2 = hm2.put("Jennifer",1);
		}

		System.out.println(data2);
	}
}