public class Task1_2 {

    public static void main(String[] args) {

        
        
        // ①「JAPAN」、「AMERICA」、「KOREA」を要素の値（初期値）とする配列 countryを作成しなさい。
        String[] country = new String[3];
        country[0] = "JAPAN";
        country[1] = "AMERICA";
        country[2] = "KOREA";

        // ② ①で作成した配列の要素数を出力してください。
        System.out.println(country.length);
        
        // ③下記の値を保持した、要素数3のStringクラスの配列strArrayを作成しなさい。
        String[] strArray = {"りんご","もも","ぶどう"};
        strArray[0] = "りんご";
        strArray[1] = "もも";
        strArray[2] = "ぶどう";
        
        
        /*   1番目（先頭）の要素に 「りんご」 を代入
        /*   2番目の要素に 「もも」 を代入
        /*   3番目の要素に 「ぶどう」 を代入
         */
        
        // ④ ③で作成した配列の2番目の要素を出力しなさい。
        System.out.println(strArray[1]);

        /* ⑤下記の処理について、何をしているのかコメントを記入してください。
         *  [要素数が5つあるInt型の配列 intArray を"10, 20, 30, 40, 50"と定義している]
         */
        int[] intArray = { 10, 20, 30, 40, 50 };

        // ⑥下記の処理について、何をしているのかコメントを記入してください。
        // [上記で定義した2番目と5番目の要素の合計を出力している]
        System.out.println(intArray[1] + intArray[4]);

    }
}