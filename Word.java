public class Word{
	static int total;
	static int correct;
	String ja;
	String en;
	public Word(String ja,String en){
		total++;
		this.ja=ja;
		this.en=en;
	}
	boolean check(String ans){
		if(ans.equalsIgnoreCase(en)){
			correct++;
			return true;
		}else{
			return false;
		}	
	}
}
