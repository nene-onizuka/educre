/**else-if文
 * 月に応じて季節を表示
 * 3-5月　　　：春
 * 6-8月　　　：夏
 * 9-11月　　：秋
 * 12-2月　　：冬
 * 1-12月以外：無効な月です
 */
public class Main3 {
     public static void main(String[] args) {
        int month =1;
    
         if (month >= 3 && month <= 5){
            System.out.println("春");
        }else if(month >= 6 && month <= 8){
            System.out.println("夏");
         }else if(month >= 9 && month <= 11){
            System.out.println("秋");
        }else if(month <= 2 || month == 12){
            System.out.println("冬");
         }else{
            System.out.println("無効な月です");
        }
    }
        
}