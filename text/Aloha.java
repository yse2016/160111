import java.util.*;
import java.io.*;

public class Aloha{
	public static void main(String[] args) {
		HashMap<String,Integer> hm = new HashMap<String,Integer>();
		String src = "Kyoko was a high school student. Jennifer, a student from Canada, was staying with Kyoko's family.";
		src = src.replace(",","");
		src = src.replace(".","");
		src = src.replace("*","");
		src = src.replace("'s","");
		String[] result = src.split(" ");
		String[] words = new String[result.length];
		int i=0;
		int j=0;
		int n=0;
		int count=0;
		int data=0;
		String t =result[j];
		for (i=0;i < result.length ;i++ ) {
			System.out.print(result[i]+" ");
			if (result[i].equals(t)) {
				count++;
			}
		}
		System.out.println("\n"+result.length+"単語\n");

		int num=0;
			for(j=0;j<result.length;j++){
				t =result[j];
					if (hm.containsKey(t)) {
						System.out.println(t+"は既に存在している");
						num = hm.get(t)+1;
						hm.put(t,num);
					}else{
						System.out.println(t+"は存在しません。登録します");
						hm.put(t,1);
						num = hm.get(t);
						words[n] = t;
						n++;
					}
			}
				for(j=0;j<n;j++){
					String word = words[j];
					data = hm.get(word);
					System.out.println(word+":"+data);	
				}

	}
}