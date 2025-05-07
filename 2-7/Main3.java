/**RPGのダメージ計算 
 * player攻撃力（15）
 * 敵の防御力（5）
 * (攻撃力　* 2 - 防御力)　/ 3
 * 小数点は切り捨て
*/
public class Main3 {
    public static void main(String[] args) {
        int damage;

        damage = (15 * 2 - 5) / 3;

        System.out.println("与えるダメージ："+damage );
    }
    
}
