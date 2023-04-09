class Movies {
    public static void main(String[] args) {
        String[] titles = { "INDIANA JONES ET LE ROYAUME DU CRÂNE DE CRISTAL",
                "INDIANA JONES ET LA DERNIÈRE CROISADE",
                "INDIANA JONES ET LE TEMPLE MAUDIT"
        };

        String[][] actors = { { "Harrison Ford", "Shia LaBeouf", "Karen Allen" },
                { "Harrison Ford", "Sean Connery", "Denholm Elliott" },
                { "Harrison Ford", "Kate Capshaw", "Ke Huy Quan" }
        };

        for (int i = 0; i < titles.length; i++) {
            System.out.println("Dans le film " + titles[i].substring(0, 1).toUpperCase() + titles[i].substring(1).toLowerCase() + ", les principaux acteurs sont : " + actors[i][0] + ", "
            + actors[i][1] + ", " + actors[i][2]);
        }
    }
}