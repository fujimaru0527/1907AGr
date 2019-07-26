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

		boolean nextGame

		System.out.print("ゲーム開始");


		Sugoroku sugoroku = new Sugoroku();
		int playerNum = 1;
		while(1){

		System.out.print(listPlayer.get(playerNum).name+"の順番");

		Dice dice = new Dice();
		//プレーヤーを進める

		//初期値
		int start = listPlayer.get(playerNum).position;
		listPlayer.get(playerNum).position += dice.getNum();

		listPlayer.get(playerNum).setPoint(sugoroku.judge(listPlayer.get(playerNum).position));


			if(listPlayer.get(playerNum).position > 32){
				break;
			}
		}

	}

	if()



}
