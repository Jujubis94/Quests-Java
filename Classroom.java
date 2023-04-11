public class Classroom {
    public static void main(String[] args) {
        Wilder julien = new Wilder("julien", true);
        Wilder maxime = new Wilder("maxime", false);
        System.out.println(julien.whoAmI());
        System.out.println(maxime.whoAmI());
    }
}
