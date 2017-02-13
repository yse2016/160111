public class Aloha{
	public static void main(String[] args) {
		String src = "Kyoko was a high school student. Jennifer, a student from Canada, was staying with Kyoko's family.";
		src = src.replace(",","");
		src = src.replace(".","");
		src = src.replace("'s","");
		String[] result = src.split(" ");
		String t = "Kyok";
		int count=0;
		for (int i=0;i < result.length ;i++ ) {
			System.out.print(result[i]+" ");
			if (result[i].equals(t)) {
				count++;
			}
		}
		System.out.println("\n"+result.length+"単語");
		System.out.println(t+":"+count);
	}
}