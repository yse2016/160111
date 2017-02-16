import java.util.*;

public class Aloha2{
	public static void main(String[] args) {
		HashMap<String,String> hm = new HashMap<String,String>();
		hm.put("Key","Value");
		hm.put("Key2","あろは");

		String target = "Key2";
		String val = hm.get(target);
		System.out.println(target+":"+val);

		String val2 = args[1];
		hm.replace(args[0],args[1]);
		System.out.println(args[0]+val2);
		
		System.out.println("values:"+hm.values());

		hm.forEach((keyName,valueAddress) -> System.out.println(keyName+":"+valueAddress));

	}
}