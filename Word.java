import java.util.*;
public class Word{
	static int total=0;
	static int correct=0;
	String ja;
	String en;
	Word(String ja,String en){
		this.ja=ja;
		this.en=en;
		total++;
	}
	public boolean check(String ans){
		if(ans.equalsIgnoreCase(this.en)){
			System.out.println("正解");
			correct++;
			return true;
		}else{
			System.out.printf("不正解！%sの英単語は%s%n",this.ja,this.en);
			return false;
		}
	}
}
