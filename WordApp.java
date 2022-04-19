import java.util.*;
public class WordApp{
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);

		Word[] arr={
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
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i].ja+">>");
			String name =scan.next();

			if(arr[i].check(name)){
				System.out.println("正解");
			}else{
				System.out.printf("不正解!%sの英単語は%s%n",arr[i].ja,arr[i].en);
			}
		}
		System.out.printf("全10問中%d問正解%n",Word.correct);
	}
}
