import java.util.*;
public class WordApp{
	public static void main(String[] args){
		Scanner sc =new Scanner(System.in);
		String words[][]={
			{"ぞう","elephant"},
			{"しろくま","polarbear"},
			{"くじら","whale"},
			{"ペンギン","penguin"},
			{"カンガルー","kangaroo"},
			{"ライオン","lion"},
			{"ひと","human"},
			{"いぬ","dog"},
			{"ねこ","cat"},
			{"あり","ant"},
		};
		for(int i=0;i<words.length;i++){
			Word w =new Word(words[i][0],words[i][1]);
			System.out.print(words[i][0]+">>");
			String ans = sc.nextLine();
			if(w.check(ans)){
				System.out.println("正解!");
			}else{
				System.out.printf("不正解!%sの英単語は%s%n",w.ja,w.en);
			}
		}
		System.out.printf("全%d問中%d問正解%n",Word.total,Word.correct);
	}
}
