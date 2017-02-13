import java.util.*;

public class arrayList {
	public static void main(String[] args) {
		ArrayList list = new ArrayList(); 
		String str=null;
		String msg="1.データを末尾に追加する\n2.データを指定した場所に追加する\n3.指定した場所のデータを表示する\n4.指定した場所のデータを削除する\n5.指定した場所のデータを入力したデータと置き換える\n6.データの個数を調べる\n7.リスト内を検索する\n8.リストを表示する\n9.終了する";
		int it=0;

		for (int i=0;i<=8 ;i++ ) {
			System.out.println(msg);
			i = new Scanner(System.in).nextInt();
			switch (i) {
				case 1:
					System.out.println("データを追加します");
					str = new Scanner(System.in).nextLine();
					list.add(str);
				break;

				case 2:
					System.out.println("場所を指定します");
					it = new Scanner(System.in).nextInt();
					System.out.println("データを追加します");
					str = new Scanner(System.in).nextLine();
					list.add(it,str);
				break;

				case 3:
					System.out.println("指定した場所のデータを表示します");
					it = new Scanner(System.in).nextInt();
					System.out.println(list.get(it));
				break;

				case 4:
					System.out.println("指定した場所のデータを削除します");
					it = new Scanner(System.in).nextInt();
					list.remove(it);
				break;

				case 5:
					System.out.println("指定した場所のデータを入力したデータと置き換えます");
					System.out.println("場所を指定します");
					it = new Scanner(System.in).nextInt();
					System.out.println("データを追加します");
					str = new Scanner(System.in).nextLine();
					list.set(it,str);
				break;

				case 6:
					System.out.println("データの個数を調べます");
					System.out.println("個数:"+list.size());
				break;

				case 7:
					System.out.println("リストを表示します");
					int ls = list.size();
					for(int j=0;j<ls;j++){
						System.out.println(j+":"+list.get(j));
					}

				break;				
			}
		}
	}
	
}