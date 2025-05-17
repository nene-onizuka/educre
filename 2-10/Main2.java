/**if-else文
 * 試験の点数に応じて結果を表示
 * 0〜100の範囲外 →無効な点数です
 * 60 over　　　 →合格
 * under 60　　　→不合格
 */

public class Main2 {
    public static void main(String[] args) {
        int score =75;
        
        if(score >=60 && score<= 100){
            System.out.println("合格");
        } else if (score <=60 && score>= 0){
            System.out.println("不合格");
        }else {
            System.out.println("無効な点数です"); 
        }
            
    }
    
}
