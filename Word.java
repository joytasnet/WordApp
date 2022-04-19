import java.util.*;
public class Word{
	static int total;
	static int collect;
	String jp;
	String en;

	public Word(String japanese , String english){
		this.jp=japanese;
		this.en=english;
		total++;
	}
/*boolean check(String ans){}
引数で受け取ったユーザーが入力した答えと
正解(en)を大文字小文字を考慮せずに比較して、
ただしかったらtrueをそうでなければfalseを返すメソッド
その際、正しかったらcorrectに１を加える*/
	public boolean check(String ans){
		if(ans.equalsIgnoreCase(this.en)){
			collect++;
			return true;
		}else{
			return false;
		}
	}
}
