import java.util.*;
public class WordApp{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
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
			new Word("あり","ant")
		};

		System.out.println("次の単語を英語にしてください(大文字小文字は問いません)");
		for(int i=0 ; i<words.length ; i++){
			System.out.printf("%s>>",words[i].jp);
			String ans = scan.next();
			boolean isCollect = words[i].check(ans);
			if(isCollect){
				System.out.println("正解！");
			}else{
				System.out.printf("はずれ。正解は%sです%n",words[i].en);
			}
		}
		System.out.printf("全%d門中%d門正解でした！",Word.total,Word.collect);
	}
}
