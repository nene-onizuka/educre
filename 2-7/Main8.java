/**キーボドから攻撃力（50）と防御力（20）を入力
 * 通常ダメージ＝ 攻撃力(50) ー 防御力(20) = 30
 * クリティカルヒット時は通常ダメージの1.5倍（小数点以下切り捨て） =30 * 1.5
 * 両方のダメージを表示
 */

public class Main8 {
    public static void main(String[] args){
        int atackPower;
        int defensePower;
        int damage;
        double criticalDamage;

        atackPower =50;
        defensePower =20;
        damage =atackPower -defensePower;
        criticalDamage =damage *1.5;

        System.out.println("攻撃力を入力してください：" +atackPower);
        System.out.println("防御力を入力してください：" +defensePower);
        System.out.println("通常ダメージ：" +damage);
        System.out.println("クリティカルダメージ："+(int)criticalDamage);

    } 
    
}
