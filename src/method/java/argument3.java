package method.java;

public class argument3 {

	public static int add(int x, int y) {
		int ans = x + y;
		return ans;//計算だけのメソッドになっている
	}
	
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		int ans = add(100, 10);//addメソッドの呼び出し
		System.out.println("100 + 10 = " + ans );
	}

}
