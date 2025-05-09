/**キーボドから攻撃力（50）と防御力（20）を入力
 * 通常ダメージ＝ 攻撃力(50) ー 防御力(20) = 30
 * クリティカルヒット時は通常ダメージの1.5倍（小数点以下切り捨て） =30 * 1.5
 * 両方のダメージを表示
 */

import java.util.Scanner;

public class Main8 {
    public static void main(String[] args){
        Scanner scanner = new Scanner (System.in);

        System.out.print("攻撃力を入力してください：");
        String atackPowerStr = scanner.nextLine();
        int atackPower = Integer.parseInt(atackPowerStr);
        atackPower = 50;

        System.out.print("防御力を入力してください：" );
        String defensePowerStr = scanner.nextLine();
        int defensePower = Integer.parseInt(defensePowerStr);
        defensePower = 20;

        System.out.print("通常ダメージ：");
        String damageStr = scanner.nextLine();
        int damage = Integer.parseInt(damageStr);
        damage =atackPower - defensePower;
        
        System.out.print("クリティカルダメージ：");
        String criticalDamageStr = scanner.nextLine();
        double criticalDamage = Integer.parseInt(criticalDamageStr);
        criticalDamage = damage *1.5;

        
        scanner.close();

    } 
    
}
