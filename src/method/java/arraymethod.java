package method.java;

public class arraymethod {

	public static void printArray(int[] array) {//引数に配列型を指定
		for(int element : array) {
			System.out.println(element);		}
	}
	
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		int[] array = {1, 2, 3};
		printArray(array);//配列を渡す
	}

}
