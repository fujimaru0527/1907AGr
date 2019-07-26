package sugoroku;

import java.util.ArrayList;
import java.util.Random;

public class Sugoroku {
	public Sugoroku() {
		//ランダム関数準備
		Random random = new Random();

		//Playerクラスのインスタンス化
		Player player = new Player(0);

		//すごろくの長さ
		ArrayList<String> sugoroku = new ArrayList<String>(8);

		//すごろくにイベント発生↓
		sugoroku.add(0, "スタート");
		for (int i = 1; i < sugoroku.size() /* =8 */ ; i++) {
			//偶数のときにプラスイベント、奇数のときにマイナスイベント
			if (i % 2 == 0) {
				sugoroku.add(i, "プラスマス");
			} else {
				sugoroku.add(i, "マイナスマス");
			}
		}
	}

	//イベント（ポイント加算）
	public static void plusEvent() {
		//Playerクラスのインスタンス化
		Player player = new Player(0);
		player.pointPlus(1);
	}

	//イベント（ポイント減算）
	public static void minusEvent() {
		//Playerクラスのインスタンス化
		Player player = new Player(0);
		player.pointMinus(1);
	}

	//イベントなし
	public static void noEvent() {

	}
}
