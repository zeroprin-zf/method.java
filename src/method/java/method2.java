package method.java;

public class method2 {
	
	public static void methodA() {
		System.out.println("methodA");
		methodB();
	}
	
	public static void methodB() {
		System.out.println("methodB");
	}

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		methodA();//必ずメインメソッドから動き始める
		//コード内でも人にわかりやすく伝えるコミュニケーション能力が必要
	}

}
