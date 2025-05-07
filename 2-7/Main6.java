/**RPGの経験値管理
 * 現在の経験値(1000)を文字列として入力
 * ボーナス経験値として25％増加(小数点以下切り捨て)
 * 増加後の経験値を表示
 */
public class Main6 {
    public static void main(String[] args) {
        int experiencePoints;
        double bonusExperiencePoints;

        experiencePoints =1000;
        bonusExperiencePoints =experiencePoints *1.25;

        System.out.println("現在の経験値を入力してください：" +experiencePoints);
        System.out.println("ボーナス後の経験値：" +(int)bonusExperiencePoints);
    
    }
    
}
