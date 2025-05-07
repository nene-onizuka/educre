/**
 * 買い物計算
 * ノート（280*3),鉛筆(120*5),消しゴム(100*2)
 * 消費税10％
 * 2000円で支払った場合のお釣り
 */
public class Main5 {
    public static void main(String[] args) {
        int notebook;
        int pencil;
        int eraser;

        notebook = 280;
        pencil = 120;
        eraser = 100;

        int subtotal;
        subtotal = (notebook *3)+(pencil *5) +(eraser *2);

        double tax;
        tax = subtotal *0.1;

        double total;
        total = subtotal +tax;

        System.out.println("小計：" +subtotal+"円");
        System.out.println("消費税："+(int)tax+"円");
        System.out.println("合計金額："+(int)total+"円");
        System.out.println("おつり："+(int)(2000 - total)+"円");
    
    }
    
}
