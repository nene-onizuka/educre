/**初期体力100のモンスターに３回攻撃
 * 1回の攻撃で1ダメージ
 * デクリメント演算子を使用
 * 各攻撃後の体力を表示
 */

public class Main7 {
    public static void main(String[] args) {
        int physicalStrength = 100;

        System.out.println("攻撃1回目：残り体力"+ physicalStrength);

        physicalStrength--;

        int number =1;
        number++;

        System.out.println("攻撃"+number +"回目：残り体力"+ physicalStrength);

        physicalStrength--;
        number++;
        System.out.println("攻撃"+number +"回目：残り体力"+ physicalStrength);

    }
    
}