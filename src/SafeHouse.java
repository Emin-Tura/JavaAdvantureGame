public  class SafeHouse extends Location {
    public SafeHouse(Player player) {
        super(player, "Güvenli Ev");
    }

    @Override
    public boolean onLocation() {
        System.out.println("Güvenli evdesiniz. Canınız yenilendi.");
        return true;
    }
}
