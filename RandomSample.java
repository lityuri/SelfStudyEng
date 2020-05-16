package randomSample;

import java.util.Random;

//https://eng-entrance.com/java-math-random

public class RandomSample {
	public static void main(String[] args) {
		//Randonクラスの生成（シード指定なし）
		Random rnd = new Random();

		//乱数を取得する
		int iValue = rnd.nextInt();
		int iValue2 = rnd.nextInt();
		int iValue3 = rnd.nextInt(100);
		int iValue4 = rnd.nextInt(100) + 100;
		long lValue = rnd.nextLong();
		double dValue = rnd.nextDouble();
		float fValue = rnd.nextFloat();
		boolean bValue = rnd.nextBoolean();

		System.out.println("int型: " + iValue);
		System.out.println("int型(2回目): " + iValue2);
		System.out.println("int型(0-99): " + iValue3);
		System.out.println("int型(100-199): " + iValue4);
		System.out.println("long型: " + lValue);
		System.out.println("double型: " + dValue);
		System.out.println("float型: " + fValue);
		System.out.println("boolean型: " + bValue);

		long seed = 1000; //シードを指定

		//Randomクラスの生成(シード指定あり)
		Random rndSeed = new Random(seed);
		int iValueSd = rndSeed.nextInt();
		int iValueSd2 = rndSeed.nextInt();

		//シードを指定して取得した値を出力
		System.out.println("シード指定int型: " + iValueSd);
		System.out.println("シード指定int型()2回目: " + iValueSd2);

		//同じシードの別のRandomクラスを生成
		Random rndSeed2 = new Random(seed);
		int iValueSd3 = rndSeed2.nextInt();
		int iValueSd4 = rndSeed2.nextInt();

		//取得した値を出力
		System.out.println("同一シード指定int型: " + iValueSd3);
		System.out.println("同一シード指定int型(2回目): " + iValueSd4);
	}
}
