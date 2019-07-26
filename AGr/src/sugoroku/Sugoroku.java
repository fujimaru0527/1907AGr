package sugoroku;

import java.util.ArrayList;

public class Sugoroku {

	//すごろくの長さ
	ArrayList<String> sugoroku = new ArrayList<String>(32);

	//sugorokuフィールドの作成
	public Sugoroku() {

		//すごろくにイベント発生↓
		sugoroku.add(0, "スタート");
		for (int i = 1; i < sugoroku.size(); i++) {
			/*
			 * 偶数のときにプラスイベント、奇数のときにマイナスイベント
			 *
			 */
			if (i % 2 == 0) {
				sugoroku.add(i, "プラスマス");
			} else {
				sugoroku.add(i, "マイナスマス");
			}
		}
	}

	public int judge(int n) {
		if (n % 2 == 0) {
			System.out.println(sugoroku.get(n));
			return 1;
		} else {
			System.out.println(sugoroku.get(n));
			return -1;
		}
	}

}
