package TPMODUL2_CIKY;

public class Main{

    public static void main(String[] args) throws Exception{
        System.out.println("Class Perangkat");
        perangkat perangkat1 = new perangkat("Adata", 2, 1.80f);
        perangkat1.informasi();
        System.out.println("");


        System.out.println("Class Handphone");
        handphone handphone1 = new handphone("Sandisk", 3, 2.20f, false);
        handphone1.informasi();
        handphone1.telfon(628122122);
        handphone1.kirimSMS(52852112);
        handphone1.kirimSMS(62812121, 629292211);
        System.out.println("");


        System.out.println("Class Laptop");
        laptop laptop1 = new laptop("Seagate", 8, 2.40f, true);
        laptop1.informasi();
        laptop1.bukaGame();
        laptop1.kirimEmail("niceyuk@gmail.com");
        laptop1.kirimEmail("aanarji@gmail.com", "rusmango@gmail.com");
        System.out.println("");
    }
}
