package sugoroku;

public class Player {
	public int point;
	String name;
	int num;
	int position;

	//初期値がポイント０、名前Player+nam、現在位置は北海道
	public Player(int nam){
		this.point = 0;
		this.num = nam;
		this.name ="Player"+this.num;
		this.position = 0;
		System.out.print("現在地は　" + position + "　北海道（仮）");
		}

	//ポイント加算
	public void pointPlus(int var){
		this.point+=var;
	}
	//ポイント減産
	public void pointMinus(int var){
		this.point-=var;
	}
	//ポイントゲッター
	public int getPoint(){
		return this.point;
	}
	//現在位置の表示
	public int potision(){
		System.out.print("現在位置は"+this.position+"地区");
		return position;
	}

}
