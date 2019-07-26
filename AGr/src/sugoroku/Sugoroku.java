package sugoroku;

import java.util.ArrayList;

public class Sugoroku {

	// すごろくの長さ
	ArrayList<String> sugoroku = new ArrayList<String>();

	// sugorokuフィールドの作成
	public Sugoroku() {

		// すごろくにイベント発生↓
		sugoroku.add(0, "スタート");
		for (int i = 1; i <= 32; i++) {
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

	public void bord(int aPlayer, int bPlayer) {
		System.out.println("すごろくマス目");
		System.out.println("スタート｜北海道　｜　東北　｜　関東　｜　中部　｜　近畿　｜　中四国｜　九州　｜　沖縄　｜ゴール");
		System.out.print("　　　　　");
		for (int i = 1; i < 32; i++) {
			System.out.printf("%2d", i);
			if (i % 4 == 0) {
				System.out.print("　");
			}
		}
		System.out.println(" ");
		if (aPlayer == 0) {
			System.out.print("　　　");
		} else {
			System.out.print("　　　　　");
		}
		for (int i = 0; i < aPlayer; i++) {
			System.out.print("　");
			if (i % 4 == 0) {
				System.out.print("　");
			}
		}
		System.out.println("○");

		if (aPlayer == 0) {
			System.out.print("　　　");
		} else {
			System.out.print("　　　　　");
		}
		for (int i = 0; i < aPlayer; i++) {
			System.out.print("　");
			if (i % 4 == 0) {
				System.out.print("　");
			}
		}
		System.out.println("●");
	}

}
