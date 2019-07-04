class Classroom {
    public static void main(String[] args) {
        Wilder jvd = new Wilder("Jean-Claude", true);
        Wilder grincheu = new Wilder("Grincheu", false);
        System.out.println(jvd.whoAmI());
        System.out.println(grincheu.whoAmI());
    }
}