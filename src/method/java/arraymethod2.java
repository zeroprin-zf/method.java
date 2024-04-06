package method.java;

public class arraymethod2 {

	public static void incArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			array[i]++;//結果をretrunで返してない
		}
	}
	
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		int[] array = {1, 2, 3};
		incArray(array);//メソッド実行
		for (int i : array) {//arrayの全要素の出力
			System.out.println(i);
		}
	}

}
