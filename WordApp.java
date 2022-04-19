import java.util.*;
public class WordApp{
	public static void main(String[] args){
		Word[] words = {
			new Word("ぞう","elephant"),
			new Word("しろくま","polarbear"),
			new Word("くじら","whale"),
			new Word("ペンギン","penguin"),
			new Word("カンガルー","kangaroo"),
			new Word("ライオン","lion"),
			new Word("ひと","human"),
			new Word("いぬ","dog"),
			new Word("ねこ","cat"),
			new Word("あり","ant"),	
		};
		Scanner scan = new Scanner(System.in);

		for(int i=0;i<words.length;i++){
			System.out.printf("%s>>",words[i].ja);
			String ans = scan.next();
			words[i].check(ans);
		}
		System.out.printf("全%d問中%d問正解",Word.total,Word.correct);

	}
}
