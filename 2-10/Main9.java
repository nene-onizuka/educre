/**switch文
 * 2つの数値と演算子で計算を実行
 * 演算子：+ , - , * , / を使用
 * 上記以外の演算子：無効な演算子です
 * [ / ]を使用した場合で2つ目のオペラントが０の場合：[エラー：０で割ることはできません]
 */

public class Main9 {
    public static void main(String[] args) {
        int num1 =10;
        int num2 =5;
        char operator = '+';
        int result = 15;

        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 != 0){
                    result = num1 / num2;
                }else{
                    System.out.println("エラー：０で割ることはできません");
                    return;
                }
                break;
                
            default:
                System.out.println("無効な演算子です");
                return;
        }
        System.out.println(result);
    }
    
}
