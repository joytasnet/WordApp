public class Word{

	static int total; //(総問題数)
	static int correct; //(正解数)
	String ja; //(日本語)
	String en; //(英語)
	public Word(String ja,String en){
		this.ja=ja;
		this.en=en;
		total++;
	}
	boolean check(String ans){
		if(ans.equalsIgnoreCase(this.en)){
			correct++;
			return true;
		}
		return false;
	}
}
