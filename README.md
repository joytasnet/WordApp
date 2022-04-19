# 英単語学習アプリを作成しよう

## 実行例
ぞう>>elephant   
正解!   
しろくま>>sirokuma  
不正解!しろくまの英単語はpolarbear  
くじら>>whale  
正解!  
ペンギン>>penguin  
正解!  
カンガルー>>kangaroo  
正解!  
ライオン>>lion  
正解!  
ひと>>human  
正解!  
いぬ>>dog  
正解!  
ねこ>>cat  
正解!  
あり>>ant  
正解!  
全10問中9問正解

## 作成方法

1. Wordクラスを以下の仕様で作成する
フィールド	
static int total; (総問題数)
static int correct; (正解数)
String ja; (日本語)	
String en; (英語)	

コンストラクタ  
引数２つ  
(ja,en)  
コンストラクタのなかでtotalを１増やす処理
(問題が生成される度にtotalが1増える)

メソッド  
boolean check(String ans){}  
引数で受け取ったユーザーが入力した答えと  
正解(en)を大文字小文字を考慮せずに比較して、  
ただしかったらtrueをそうでなければfalseを返すメソッド  
その際、正しかったらcorrectに１を加える  

2. WordAppクラスを作成し、実行例のようになるように作成する

### 資料
("ぞう","elephant"),  
("しろくま","polarbear"),  
("くじら","whale"),  
("ペンギン","penguin"),  
("カンガルー","kangaroo"),  
("ライオン","lion"),  
("ひと","human"),  
("いぬ","dog"),  
("ねこ","cat"),  
("あり","ant"),  
