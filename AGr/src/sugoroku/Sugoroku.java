package sugoroku;

import java.util.ArrayList;
import java.util.Random;

public class Sugoroku {
		//sugorokuフィールドの作成
		public Sugoroku() {
		//ランダム関数準備
		Random random = new Random();

		//すごろくの長さ
		ArrayList<String> sugoroku = new ArrayList<String>(32);

		//すごろくにイベント発生↓
		sugoroku.add(0, "スタート");
		for (int i = 1; i < sugoroku.size(); i++) {
			//偶数のときにプラスイベント、奇数のときにマイナスイベント
			if (i % 2 == 0) {
				sugoroku.add(i, "プラスマス");
			} else {
				sugoroku.add(i, "マイナスマス");
			}
		}
	}

	//イベント（ポイント加算）メソッド
	public static int plusEvent() {
		return 1;
	}

	//イベント（ポイント減算）メソッド
	public static int minusEvent() {
		return 1;
	}

	//	//イベントなし
	//	public static void noEvent() {
	//
	//	}
}
