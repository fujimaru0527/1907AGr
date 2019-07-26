package sugoroku;

public interface Quiz{
	void quiz();
	int answer(int answer);
}

// 北海道クラス
class Hokkaido implements Quiz {

	@Override
	public void quiz() {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("北海道にまつわるクイズです。");
		System.out.println("北海道・札幌市の7月の平均気温は何度でしょうか？");

		System.out.println();

		System.out.println("1:20.5℃"); // 正解
		System.out.println("2:19.8℃");
		System.out.println("3:21.2℃");
		System.out.println("4:15.3℃");
	}

	@Override
	public int answer(int answer) {
		switch (answer) {
		case 1:
			System.out.println("正解！+５ポイントGet!");
			return 5;
		default:
			System.out.println("不正解！残念！");
			return 0;
		}

	}

}

// 東北クラス
class Touhoku implements Quiz {

	@Override
	public void quiz() {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("青森にまつわるクイズです。");
		System.out.println("りんごで有名な青森県ですが、平成30年産の生産量は何トンでしょうか？");

		System.out.println();

		System.out.println("1:450,200トン");
		System.out.println("2:447,800トン"); //正解
		System.out.println("3:386,500トン");
		System.out.println("4:400,500トン");
	}

	@Override
	public int answer(int answer) {
		switch (answer) {
		case 2:
			System.out.println("正解！+５ポイントGet!");
			return 5;
		default:
			System.out.println("不正解！残念！");
			return 0;
		}

	}
}

// 関東クラス
class Kantou implements Quiz {

	@Override
	public void quiz() {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("東京都にまつわるクイズです。");
		System.out.println("東京23区で一番人口の少ない地区はどこでしょう？");

		System.out.println();

		System.out.println("1:台東区");
		System.out.println("2:渋谷区");
		System.out.println("3:千代田区"); //正解
		System.out.println("4:品川区");
	}

	@Override
	public int answer(int answer) {

		switch (answer) {
		case 3:
			System.out.println("正解！+５ポイントGet!");
			return 5;
		default:
			System.out.println("不正解！残念！");
			return 0;
		}

	}
}

// 中部クラス
class Tyubu implements Quiz {

	@Override
	public void quiz() {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("富士山にまつわるクイズです。");
		System.out.println("富士山の現在の標高は何ｍでしょうか？");

		System.out.println();

		System.out.println("1:3580ｍ");
		System.out.println("2:3620ｍ");
		System.out.println("3:3810ｍ");
		System.out.println("4:3776ｍ"); // 正解
	}

	@Override
	public int answer(int answer) {

		switch (answer) {
		case 4:
			System.out.println("正解！+５ポイントGet!");
			return 5;
		default:
			System.out.println("不正解！残念！");
			return 0;
		}

	}
}

// 近畿クラス
class Kinki implements Quiz {

	@Override
	public void quiz() {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("京都府にまつわるクイズです。");
		System.out.println("京都で一番高いタワーはどれでしょう？");

		System.out.println();

		System.out.println("1:京セラ本社ビル");
		System.out.println("2:五重塔");
		System.out.println("3:京都駅ビル");
		System.out.println("4:京都タワー"); // 正解
	}

	@Override
	public int answer(int answer) {

		switch (answer) {
		case 4:
			System.out.println("正解！+５ポイントGet!");
			return 5;
		default:
			System.out.println("不正解！残念！");
			return 0;
		}

	}
}

// 四国クラス
class Shikoku implements Quiz {

	@Override
	public void quiz() {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("香川県にまつわるクイズです。");
		System.out.println("うどんが香川県に伝わったのは今からおよそ何年前でしょうか？");

		System.out.println();

		System.out.println("1:1200年前"); // 正解
		System.out.println("2:900年前");
		System.out.println("3:1350年前");
		System.out.println("4:1000年前");
	}

	@Override
	public int answer(int answer) {
		// メインから入力してもらった値が来る

		switch (answer) {
		case 1:
			System.out.println("正解！+５ポイントGet!");
			return 5;
		default:
			System.out.println("不正解！残念！");
			return 0;
		}

	}
}

// 九州クラス
class kyusyu implements Quiz {

	@Override
	public void quiz() {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("九州にまつわるクイズです。");
		System.out.println("漫画「天才バカボン」に登場するバカボンパパの出身中学校がある県はどこでしょう？");

		System.out.println();

		System.out.println("1:福岡");
		System.out.println("2:佐賀");
		System.out.println("3:熊本"); // 正解
		System.out.println("4:長崎");
	}

	@Override
	public int answer(int answer) {
		// メインから入力してもらった値が来る

		switch (answer) {
		case 3:
			System.out.println("正解！+５ポイントGet!");
			return 5;
		default:
			System.out.println("不正解！残念！");
			return 0;
		}

	}
}

// 沖縄クラス
class Okinawa implements Quiz {

	@Override
	public void quiz() {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("沖縄県にまつわるクイズです。");
		System.out.println("沖縄の方言で「いらっしゃいませ」は「メンソーレ」ですが、「さようなら」はなんでしょう？");

		System.out.println();

		System.out.println("1:にふぇーでーびる");
		System.out.println("2:くゎっちーさびら");
		System.out.println("3:たいみそちー");
		System.out.println("4:ぐぶりーさびら"); // 正解
	}

	@Override
	public int answer(int answer) {
		// メインから入力してもらった値が来る

		switch (answer) {
		case 4:
			System.out.println("正解！+５ポイントGet!");
			return 5;
		default:
			System.out.println("不正解！残念！");
			return 0;
		}

	}
}