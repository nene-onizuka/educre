/**playerのHP表示
 * 最大HP(1000.0)の83.7%現在HPを計算
 * 現在HPを正数で表示(小数点いかの切り捨て)
 */
public class Main4 {
    public static void main(String[] args) {
       double hitPoint;

       hitPoint =  (1000 * 0.837);

        System .out.println("現在HP："+(int)hitPoint );
    }
}
