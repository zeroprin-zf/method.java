package method.java;

public class execrises2 {

	public static void email(String title, String address, String text) {
		System.out.println(address + "に、以下のメールを送信しました");
		System.out.println("件名：" + title);
		System.out.println("本文：" + text);
	}
	
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		String title = "乾物";
		String address = "samoedo@mail";
		String text = "そういうこと";
		email(title, address, text);
	}

}
