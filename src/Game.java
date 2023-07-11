import java.util.Scanner;

public class Game {
    private Scanner input = new Scanner(System.in);

    public void start() {
        System.out.println("Macera Oyununa Hoşgeldiniz !");
        System.out.print("Lütfen bir isim giriniz : ");

//        String playerName = input.nextLine();
        Player player = new Player("Muhammed Emin");
        System.out.println("Sayın " + player.getName() + " bu karanlık ve sisli adaya hoşgeldiniz ! Burada yaşananların hepsi gerçek. Bu adadan kurtulmak için bir yol bulmalısın !");
        System.out.println("İyi şanslar !");
        System.out.println("****************************************************");
        player.selectChar();

        Location location = null;
        while (true) {
            player.printInfo();
            System.out.println();
            System.out.println("---------- Bölge Seçiniz ----------");
            System.out.println();
            System.out.println("1 - Güvenli Ev ==> Burası sizin için güvenli bir bölge. Canınızı yenileyebilirsiniz.");
            System.out.println("2 - Mağaza ==> Silah ve zırh satın alabilirsiniz.");
            System.out.println("0 - Çıkış Yap ==> Oyundan çıkış yaparsınız.");
            System.out.println("Lütfen gitmek istediğiniz bölgeyi seçiniz : ");
            int selectLoc = input.nextInt();
            switch (selectLoc) {
                case 0:
                    location = null;
                    break;
                case 1:
                    location = new SafeHouse(player);
                    break;
                case 2:
                    location = new ToolStore(player);
                    break;
                default:
                    location = new SafeHouse(player);
            }
            if (location == null){
                System.out.println("Oyundan çıkış yaptınız !");
                break;
            }
            if (!location.onLocation()) {
                System.out.println("GAME OVER !");
                break;
            }

        }
    }
}
