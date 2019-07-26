package sugoroku;

import java.util.ArrayList;
import java.util.List;



public class Main {

	public static void main(String[] args) {
		// TODO 自動生成さたメソッド・スタブ
		//プレーヤー情報生成
		Player aPlayer = new Player(1);
		Player bPlayer = new Player(2);
		List<Player> listPlayer = new ArrayList<>();
		listPlayer.add(aPlayer);
		listPlayer.add(bPlayer);

		System.out.print("ゲーム開始");


		Sugoroku sugoroku = new Sugoroku();

		System.out.print(aPlayer.name+"の順番");







	}



}
