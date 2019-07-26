package sugoroku;

public class Dice {

	private int num;

	//ダイスロール
	public Dice() {
		num = (int) (Math.random() * 6) + 1;
		//何マス進むかの表示
		System.out.println("出た目 : "+num);
		System.out.println(num+"マス進みます。");

	}

	//ダイスの出た目
	public int getNum() {
		return num;
	}

	//ダイスの目の設定
	public void setNum(int num) {
		this.num = num;
	}

}
