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
	boolean check(String ans){

		if(ans.equalsIgnoreCase(this.en)){
				correct++;
				return true;
		}else{
			return false;
		}
	}
}
