import java.util.*;
public class WordApp{
	public static void main(String[] args){
		Word[] data={
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
		for(int i =0;i<data.length;i++){
			System.out.print(data[i].ja +">");
			String ans =new Scanner(System.in).next();
			if(data[i].check(ans)){
				System.out.println("正解！");
			}
			else{
				System.out.printf("不正解！%sの英単語は%s%n",data[i].ja,data[i].en);
			}
		}
		System.out.println("全"+Word.total+"問中"+Word.correct+"問正解");

	}
}
