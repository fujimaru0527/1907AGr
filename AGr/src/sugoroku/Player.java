package sugoroku;

public class Player {
	public int point;
	String name;
	int nam;

	//初期値がポイント０、名前Player+nam
	public Player(int nam){
		this.point=0;
		this.nam = nam;
		this.name="Player"+this.nam;

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

}
