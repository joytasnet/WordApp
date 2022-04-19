import java.util.*;
public class WordApp{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
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

		for(int i = 0; i < words.length; i++){
			System.out.printf("%s>>",words[i].ja);
			String ans = sc.nextLine();
			if(words[i].check(ans)){
				System.out.println("正解!");
			}else{
				System.out.printf("不正解!%sの英単語は%s%n",words[i].ja,words[i].en);
			}
		}
		System.out.printf("全%d問中%d問正解",Word.total,Word.correct);
	}
}
