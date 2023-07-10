import java.util.Scanner;

public class Game {
    private Scanner input = new Scanner(System.in);

    public void start() {
        System.out.println("Macera Oyununa Hoşgeldiniz !");
        System.out.print("Lütfen bir isim giriniz : ");

//        String playerName = input.nextLine();
        Player player = new Player("playerName");
        System.out.println("Sayın " + player.getName() + " bu karanlık ve sisli adaya hoşgeldiniz ! Burada yaşananların hepsi gerçek. Bu adadan kurtulmak için bir yol bulmalısın !");
        System.out.println("İyi şanslar !");
        System.out.println("****************************************************");
        player.selectChar();
        }
}
