/**switch文とbreak文の動作理解
 * 携帯キーパッドの数字と押下回数に応じて文字を表示
 * key1とkey2を使用、表示文字A-F
 * key1: *1[A] *2[B] *3[C]
 * key2: *1[D] *2[E] *3[F]
 * key1/2以外: [Invalid key]
 */

public class Main7 {
    public static void main(String[] args) {
        int key =2;
        int pressCount =2;

        switch (key) {
            case 1:
                if(pressCount ==1){
                    System.out.println("A");
                }else if(pressCount == 2){
                    System.out.println("B");
                }else{
                    System.out.println("C");
                }
                break;
            
            case 2:
                if(pressCount ==1){
                    System.out.println("D");
                }else if(pressCount == 2){
                    System.out.println("E");
                }else{
                    System.out.println("F");
                }
                break;
        
        default:
            System.out.println("Invalid key");
            break;
        }
    }
    
}
