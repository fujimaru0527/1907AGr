package sugoroku;

public class Game {

}

interface Quiz {
	void quiz();

	void answer();
}

// 北海道クラス
class Hokkaido implements Quiz {

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

// 東北クラス
class Touhoku implements Quiz {

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

//関東クラス
class Kantou implements Quiz {

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

//中部クラス
class Tyubu implements Quiz {

	@Override
	public void quiz() {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("富士山にまつわるクイズです。");
		System.out.println("富士山の現在の標高は何ｍでしょうか？");
	}

	@Override
	public void answer() {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("A.3580ｍ");
		System.out.println("B.3620ｍ");
		System.out.println("C.3810ｍ");
		System.out.println("D.3776ｍ"); //正解
	}
}


//近畿クラス
class Kinki implements Quiz {

	@Override
	public void quiz() {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("京都府にまつわるクイズです。");
		System.out.println("京都で一番高いタワーはどれでしょう？");
	}

	@Override
	public void answer() {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("A.京セラ本社ビル");
		System.out.println("B.五重塔");
		System.out.println("C.京都駅ビル");
		System.out.println("D.京都タワー"); //正解
	}
}

//四国クラス
class Shikoku implements Quiz {

	@Override
	public void quiz() {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("香川県にまつわるクイズです。");
		System.out.println("うどんが香川県に伝わったのは今からおよそ何年前でしょうか？");
	}

	@Override
	public void answer() {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("A.1200年前"); //正解
		System.out.println("B.900年前");
		System.out.println("C.1350年前");
		System.out.println("D.1000年前");
	}
}

//九州クラス
class kyusyu implements Quiz {

	@Override
	public void quiz() {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("九州にまつわるクイズです。");
		System.out.println("漫画「天才バカボン」に登場するバカボンパパの出身中学校がある県はどこでしょう？");
	}

	@Override
	public void answer() {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("A.福岡");
		System.out.println("B.佐賀");
		System.out.println("C.熊本"); // 正解
		System.out.println("D.長崎");
	}
}

//沖縄クラス
class Okinawa implements Quiz {

	@Override
	public void quiz() {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("沖縄県にまつわるクイズです。");
		System.out.println("沖縄の方言で「いらっしゃいませ」は「メンソーレ」ですが、「さようなら」はなんでしょう？");
	}

	@Override
	public void answer() {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("A.にふぇーでーびる");
		System.out.println("B.くゎっちーさびら");
		System.out.println("C.たいみそちー");
		System.out.println("D.ぐぶりーさびら"); //正解
	}
}