package sugoroku;

import java.util.ArrayList;
import java.util.Random;

public class Sugoroku {
	public Sugoroku() {
		//ランダム関数準備
		Random random = new Random();

		//すごろくの長さ
		ArrayList<String> sugoroku = new ArrayList<String>(8);

		//すごろくにイベント発生↓
		sugoroku.add(0,"スタート");
		for(int i = 1; i < sugoroku.size() /* =8 */  ; i++) {

			if(i%2 == 0 ) {
				sugoroku.add(i, "-1");
			}else {
				sugoroku.add(i, "1");
			}
		}
	}
}
