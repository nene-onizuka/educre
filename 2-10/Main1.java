/**基本的なif文
 * 20歳以上の場合 のみ お酒の購入が可能と表示 */

public class Main1{
    public static void main(String[] args) {
        int age =18;

        if(age >20){
            System.out.println("お酒を購入できます。");
        } else {
            System.out.println("お酒を購入できません。");
        }

    }
}