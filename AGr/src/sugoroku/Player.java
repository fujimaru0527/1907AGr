package sugoroku;

public class Player {
	public int point;
	String name;
	int num;

	//初期値がポイント０、名前Player+nam
	public Player(int num){
		this.point=0;
		this.num = num;
		this.name="Player"+this.num;

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
