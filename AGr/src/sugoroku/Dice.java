package sugoroku;

public class Dice {

	public int num;

	//ダイスロール
	public Dice() {
		num = (int) (Math.random() * 6) + 1;
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
