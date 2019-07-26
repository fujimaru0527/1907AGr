package sugoroku;


public class Game{

}

interface Quiz{
	void quiz();
	void answer();

}

//北海道クラス
class Hokkaido implements Quiz{

	@Override
	public void quiz() {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("クイズの内容");
	}

	@Override
	public void answer() {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("A.");
		System.out.println("B.");
		System.out.println("C.");
		System.out.println("D.");
	}




}

