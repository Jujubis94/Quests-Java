package Candies;

 class CandyCount {
    public static void main(String[] args) {
        double Money = 12.4;
        double Price = 1.2;
        int Candy = 0;
        if (Money > 0 && Price > 0 ) {
            while (Money - Price >=0) {
                Candy = Candy + 1;
                Money = Money - Price;
            }
        }
        System.out.println(Candy);
    }
}
