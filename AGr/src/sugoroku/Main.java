package sugoroku;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成さたメソッド・スタブ
		// プレーヤー情報生成
		Player aPlayer = new Player(1);
		Player bPlayer = new Player(2);

		System.out.print("ゲーム開始");
		Scanner scan = new Scanner(System.in);

		Sugoroku sugoroku = new Sugoroku();
		int playerNum = 1;
		while (true) {
			if (aPlayer.position < 32) {

				System.out.print(aPlayer.name + "の順番\nエンターを押してください。");
				scan.next();

				Dice dice = new Dice();
				// プレーヤーを進める

				scan.next();

				// 初期値
				int start = aPlayer.position;
				aPlayer.position += dice.getNum();
				if(aPlayer.position > 32){
					aPlayer.position = 32;
				}

				aPlayer.setPoint(sugoroku.judge(aPlayer.position));

				scan.next();
				Quiz(start, aPlayer.position);
				if (aPlayer.position == 32) {
					System.out.print(aPlayer.name + "はゴールしました");
				}
			} else {
				System.out.print(aPlayer.name + "のゴールのボーナス");
				aPlayer.setPoint(1);
			}
			if (bPlayer.position < 32) {

				System.out.print(bPlayer.name + "の順番");

				scan.next();

				Dice dice = new Dice();
				// プレーヤーを進める

				scan.next();

				// 初期値
				int start = bPlayer.position;
				bPlayer.position += dice.getNum();
				if(bPlayer.position > 32){
					bPlayer.position = 32;
				}

				bPlayer.setPoint(sugoroku.judge(bPlayer.position));
				scan.next();
				Quiz(start, bPlayer.position);
				if (bPlayer.position == 32) {
					System.out.print(bPlayer.name + "はゴールしました");
				}
			} else {
				System.out.print(bPlayer.name + "のゴールのボーナス");
				bPlayer.setPoint(1);
			}

			if (aPlayer.position == 32 && bPlayer.position == 32) {
				System.out.print("二人ともゴールしました");
				break;
			}

		}

	}

	static int Quiz(int start, int end) {
		int point = 0;
		Scanner scan = new Scanner(System.in);
		if (start <= 4 && end >= 5) {
			Hokkaido hokkaido = new Hokkaido();
			hokkaido.quiz();
			System.out.println("回答番号を入力してください：");
			hokkaido.answer(scan.nextInt());
		}
		if (start <= 8 && end >= 9) {
			Touhoku touhoku = new Touhoku();
			touhoku.quiz();
			System.out.println("回答番号を入力してください：");
			touhoku.answer(scan.nextInt());
		}
		if (start <= 12 && end >= 13) {
			Kantou kantou = new Kantou();
			kantou.quiz();
			System.out.println("回答番号を入力してください：");
			kantou.answer(scan.nextInt());
		}
		if (start <= 16 && end >= 17) {
			Tyubu tyubu = new Tyubu();
			tyubu.quiz();
			System.out.println("回答番号を入力してください：");
			tyubu.answer(scan.nextInt());
		}
		if (start <= 20 && end >= 21) {
			Kinki kinki = new Kinki();
			kinki.quiz();
			System.out.println("回答番号を入力してください：");
			kinki.answer(scan.nextInt());
		}
		if (start <= 24 && end >= 25) {
			Shikoku shikoku = new Shikoku();
			shikoku.quiz();
			System.out.println("回答番号を入力してください：");
			shikoku.answer(scan.nextInt());
		}
		if (start <= 28 && end >= 29) {
			Kyusyu kyusyu = new Kyusyu();
			kyusyu.quiz();
			System.out.println("回答番号を入力してください：");
			kyusyu.answer(scan.nextInt());
		}
		if (start <= 32 && end >= 33) {
			Okinawa okinawa = new Okinawa();
			okinawa.quiz();
			System.out.println("回答番号を入力してください：");
			okinawa.answer(scan.nextInt());
		}

		return point;

	}

}
