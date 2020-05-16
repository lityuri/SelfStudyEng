package randomSample;

//https://eng-entrance.com/java-math-random

public class MathRandomSample {
	public static void main(String[] args) {
		//乱数生成
		double dValue = Math.random();
		double dValue2 = Math.random();

		//乱数生成(int型で取得)
		double iValue = (int)(Math.random() * 10);
		double iValue2 = (int)(Math.random() * 10);

		//取得した値を出力
		System.out.println("double型: " + dValue);
		System.out.println("double型(2回目): " + dValue2);
		System.out.println("int型: " + iValue);
		System.out.println("int型(2回目): " + iValue2);
	}
}
