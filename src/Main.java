import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        System.out.println("Oyun buyuklugunu giriniz");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Satir buyuklugunu giriniz:");
        int rowNumber = scanner.nextInt();
        System.out.print("Sutun buyuklugunu giriniz:");
        int colNumber = scanner.nextInt();
        MineSweeper mineSweeper = new MineSweeper(rowNumber,colNumber);
    }
}
