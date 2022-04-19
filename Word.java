public class Word{
	static int total;
	static int correct;
	String ja;
	String en;

	Word(String ja,String en){
		this.ja=ja;
		this.en=en;
		total++;
	}

	boolean check(String ans){
		if(ans.equalsIgnoreCase(this.en)){
			this.correct++;
			return true;
		}
		return false;
	}
}
