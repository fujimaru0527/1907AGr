package sugoroku;

public interface Quiz{
	void quiz();
	int answer(int answer);
}

// 北海道クラス
class Hokkaido1 implements Quiz {

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

//北海道クラス２
class Hokkaido2 implements Quiz {

	@Override
	public void quiz() {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("北海道にまつわるクイズです。");
		System.out.println("北海道のJRの路線距離はいくつでしょう？か？");

		System.out.println();

		System.out.println("1:7400km");
		System.out.println("2:2600km"); // 正解
		System.out.println("3:857km");
		System.out.println("4:2235km");
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

// 東北クラス1
class Touhoku1 implements Quiz {

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

//東北クラス2
class Touhoku2 implements Quiz {

	@Override
	public void quiz() {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("東北にまつわるクイズです。");
		System.out.println("東北地域において開発されたお米の品種は次のうちどれでしょうか？");

		System.out.println();

		System.out.println("1:ひとめぼれ"); //正解
		System.out.println("2:ひめライス");
		System.out.println("3:キヌヒカリ");
		System.out.println("4:あさひの夢");
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

// 関東クラス1
class Kantou1 implements Quiz {

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

//関東クラス2
class Kantou2 implements Quiz {

	@Override
	public void quiz() {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("群馬県にまつわるクイズです。");
		System.out.println("「新川」　群馬県にあるこの地名はなんと読むでしょうか？");

		System.out.println();

		System.out.println("1:にっかわ");
		System.out.println("2:しんかわ");
		System.out.println("3:あらかわ"); //正解
		System.out.println("4:にいがわ");
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

// 中部クラス1
class Tyubu1 implements Quiz {

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

//中部クラス2
class Tyubu2 implements Quiz {

	@Override
	public void quiz() {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("愛知県にまつわるクイズです。");
		System.out.println("愛知県の県の花はなんでしょうか？");

		System.out.println();

		System.out.println("1:レンゲソウ");
		System.out.println("2:ツツジ");
		System.out.println("3:スイセン");
		System.out.println("4:カキツバタ"); // 正解
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

// 近畿クラス1
class Kinki1 implements Quiz {

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

//近畿クラス2
class Kinki2 implements Quiz {

	@Override
	public void quiz() {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("和歌山県にまつわるクイズです。");
		System.out.println("和歌山の白浜にあるアドベンチャーで現在飼育されているパンダは何頭でしょう？");

		System.out.println();

		System.out.println("1:5匹");
		System.out.println("2:3匹");
		System.out.println("3:7匹");
		System.out.println("4:2匹"); // 正解
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

// 四国クラス1
class Shikoku1 implements Quiz {

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

//四国クラス2
class Shikoku2 implements Quiz {

	@Override
	public void quiz() {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("愛媛県にまつわるクイズです。");
		System.out.println("愛媛県の方言で、「机を移動させること」をなんというでしょう？");

		System.out.println();

		System.out.println("1:机をからう");
		System.out.println("2:机をかく"); // 正解
		System.out.println("3:机をなおす");
		System.out.println("4:机をきる");
	}

	@Override
	public int answer(int answer) {
		// メインから入力してもらった値が来る

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

// 九州クラス

class kyusyu1 implements Quiz {

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

//九州クラス2
class kyusyu2 implements Quiz {

	@Override
	public void quiz() {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("大分県にまつわるクイズです。");
		System.out.println("温泉で有名な大分県別府市ですが、源泉数は世界何位でしょうか？");

		System.out.println();

		System.out.println("1:3位");
		System.out.println("2:1位"); // 正解
		System.out.println("3:5位");
		System.out.println("4:10位");
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

// 沖縄クラス1
class Okinawa1 implements Quiz {

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

//沖縄クラス２
class Okinawa2 implements Quiz {

	@Override
	public void quiz() {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("沖縄県にまつわるクイズです。");
		System.out.println("現在、沖縄にはいくつ世界遺産があるでしょうか？");

		System.out.println();

		System.out.println("1:9"); // 正解
		System.out.println("2:7");
		System.out.println("3:10");
		System.out.println("4:5");
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