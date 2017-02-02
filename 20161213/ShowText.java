import java.util.*;
import java.io.*;

public class ShowText{
	public static void main(String[] args) {
		String data = null;
		try{
			File f = new File("data.txt");
			FileReader fr = new FileReader(f);
			BufferedReader br = new BufferedReader(fr);

			while ((data = br.readLine()) !=  null) {
					System.out.println(data);
			}

			br.close();

		}catch (Exception e) {
			e.printStackTrace();
			System.err.println("err");
		}
	}
}