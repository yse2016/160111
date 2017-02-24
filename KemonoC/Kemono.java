import java.util.*;
import java.io.*;

public class Kemono{
	public static void main(String[] args) {
		String args0 = args[0];
		char[] data = args0.toCharArray();
		int[] num = new int[data.length];
		for (int i=0;i<data.length;i++) {
			num[i] = (int)data[i];
		}
		try{
			File f = new File(args0+".kemono");
			FileOutputStream fos = new FileOutputStream(f);
			OutputStreamWriter osw = new OutputStreamWriter(fos,"UTF-8");
			PrintWriter pw = new PrintWriter(osw); 

			for (int j=0;j<num.length ;j++ ) {
				for(int n=0;n<num[j];n++){
				pw.print("たーのしー！");
				}
				pw.print("なにこれなにこれ！");
				if((j+1)!=num.length){
					pw.print("うわー！");
					pw.print("すっごーい！");
					pw.print("わーい！");
				}
			}
				pw.close();
		}catch (Exception e) {
			System.out.println("エラーです。");
			e.printStackTrace();			
		}		
	}
}