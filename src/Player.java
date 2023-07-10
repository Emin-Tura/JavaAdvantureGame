import java.util.Scanner;

public class Player {
    private int damage;
    private int health;
    private int money;
    private String name;
    private String charName;
    private Scanner input = new Scanner(System.in);

    public Player(String name) {
        this.name = name;
    }

    public void selectChar() {
        GameChar[] charList = {new Samurai(), new Archer(), new Knight()};
        System.out.println("-----------------------------------");
        for (GameChar gameChar : charList) {
            System.out.println("Karakter ID : " + gameChar.getId() + "\t Karakter Adı : " + gameChar.getName() + "\t | Hasar : " + gameChar.getDamage() + "\t | Sağlık : " + gameChar.getHealth() + "\t | Para : " + gameChar.getMoney());
        }
        System.out.println("-----------------------------------");
        System.out.print("Lütfen bir karakter seçiniz : ");
        int selectChar = input.nextInt();
        switch (selectChar) {
            case 2 -> initPlayer(new Archer());
            case 3 -> initPlayer(new Knight());
            default -> initPlayer(new Samurai());
        }
        System.out.println("Karakteriniz : " + getCharName() + "\t Hasar : " + getDamage() + "\t Sağlık : " + getHealth() + "\t Para : " + getMoney());
    }

    public void initPlayer(GameChar gameChar) {
        this.setDamage(gameChar.getDamage());
        this.setHealth(gameChar.getHealth());
        this.setMoney(gameChar.getMoney());
        this.setCharName(gameChar.getName());
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCharName() {
        return charName;
    }

    public void setCharName(String charName) {
        this.charName = charName;
    }

}