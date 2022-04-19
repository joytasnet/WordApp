public class Word{
	static int total; //(総問題数)
	static int correct; //(正解数)
	String ja; //(日本語)
	String en; //(英語)
	Word(String ja,String en){
		this.ja=ja;
		this.en=en;
		total++;
	}
	boolean check(String ans){
		boolean isMaru;
		if(ans.equalsIgnoreCase(this.en)){
			isMaru=true;
			correct++;
		}else{
			isMaru=false;
		}
		return isMaru;
	}
}
