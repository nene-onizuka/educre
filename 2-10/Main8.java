import java.nio.file.SecureDirectoryStream;

/**switch文での範囲測定の実装
 * (score/10をswitchの条件に使うことでscoreの十の位を判定)
 * 点数から評価（A-F）を判定
 * 100-90 : A
 * 89-80 : B
 * 79-70 : C
 * 69-60 : D
 * それ以外 : F
 */

public class Main8 {
    public static void main(String[] args) {
        int score =85;

        switch ( score / 10) {
            case 9:
                System.out.println("A");
                break;
            case 8:
                System.out.println("B");
                break;
            case 7:
                System.out.println("C");
                break;
            case 6:
                System.out.println("D");
                break;
            default:
                System.out.println("F");
                break;
        }
    }
    
}
