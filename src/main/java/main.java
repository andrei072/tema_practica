public class main {
    public static void main(String[] args) {

        Model model1 = new Model(8, "Samsung", 2018);
        Electronice electronice1 = new Electronice(249.99f, "Galaxy", model1 );
        Telefon s8 = new Telefon("OLED", 1440, 8, 128, electronice1);
        Model model2 = new Model(10, "ASUS", 2022);
        Electronice electronice2 = new Electronice(5499.9f, "TUF Gaming", model2);
        Laptop laptop_asus = new Laptop("i9 10900k", "NVIDIA RTX 3060", 32, 512,1440, electronice2 );
        System.out.println(s8);
        System.out.println(laptop_asus);



    }
}
