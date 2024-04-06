package method.java;

public class overload2 {
	
	public static int add(int x, int y) {
		return x + y;
	}
	
	public static int add(int x, int y, int z) {
		return x + y + z;
	}
	

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		System.out.println("10+20=" + add(10, 20));//一つ目のaddメソッドが呼び出される
		System.out.println("10+20+30=" + add(10, 20, 30));
	}

}
