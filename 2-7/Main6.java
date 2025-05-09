/**RPGの経験値管理
 * 現在の経験値(1000)を文字列として入力
 * ボーナス経験値として25％増加(小数点以下切り捨て)
 * 増加後の経験値を表示
 */
import java.util.Scanner;

public class Main6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        System.out.print("現在の経験値を入力してください：" );
        String experiencePointsStr = scanner.nextLine();
        int experiencePoints =Integer.parseInt(experiencePointsStr);
        experiencePoints =1000;

        System.out.print("ボーナス後の経験値：" );
        String bonusExperiencePointsStr = scanner.nextLine();
        double bonusExperiencePoints = Integer.parseInt(bonusExperiencePointsStr);
        bonusExperiencePoints =experiencePoints *1.25;

        scanner.close();
    
    }
    
}
