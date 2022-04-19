import java.util.*;
public class WordApp{
	public static void main(String[] args){
		Word[] words={new Word("ぞう","elephant"),new Word("しろくま","polarbear"),new Word("くじら","whale"),new Word("ペンギン","penguin"),new Word("カンガルー","kangaroo"),new Word("ライオン","lion"),new Word("ひと","human"),new Word("いぬ","dog"),new Word("ねこ","cat"),new Word("あり","ant")};
		Scanner scan=new Scanner(System.in);
		for(int i=0;i<words.length;i++){
			System.out.printf("%s>>",words[i].ja);
			String ans=scan.next();
			System.out.println(words[i].check(ans)?"正解":"不正解"+words[i].en);
		}
		System.out.printf("全%d門中%d門正解\n",Word.total,Word.correct);
	}
}
