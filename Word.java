import java.util.*;
public class Word{
	//フィールド変数
	static int total;
	static int correct;
	String ja;
	String en;

	//コンストラクタ
	public Word(String ja, String en){
		this.ja = ja;
		this.en = en;
		total ++;
	}
	//メソッド
	boolean check(String ans){
		if(ans.equalsIgnoreCase(this.en)){
			correct ++;
			return true;
		}else{
			return false;
		}
	}
}
