public class Word{
	static int total;//総問題数
	static int correct;//正解数
	String ja;//日本語
	String en;//英語

	Word(String ja,String en){
		total++;
		this.ja = ja;
		this.en = en.toLowerCase();
	}

	boolean check(String ans){
		if(ans.toLowerCase().equals(en)){
			correct++;
			return true;
		}else{
			return false;
		}
	}
}
