package method.java;

public class arraymethod3 {
	
	public static int[] makeArray(int size) {//int型配列を作成して戻すメソッド
		int[] newArray = new int[size];
		for(int i = 0; i < newArray.length; i++) {
			newArray[i] = i;
		}
		return newArray; //配列を戻す
	}

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		int[] array = makeArray(3);//arrayの全要素を出力
		for(int i : array) {
			System.out.println(i);
		}
	}

}
