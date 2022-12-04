package TPMODUL2_CIKY;

public class laptop extends perangkat{
    protected boolean webcam;

public laptop(String drive, int ram, float processor, boolean webcam){
        super(drive, ram, processor, webcam);
        this.drive = drive;
        this.ram = ram;
        this.processor = processor;
        this.webcam = webcam;
    }

    public void informasi(){
        System.out.println("Laptop ini memiliki drive tipe " + drive + " dengan ram sebesar " +  ram + "GB dan processor secepat " + processor + "Ghz. Selain itu laptop ini juga memiliki Webcam.");
    }
    public void bukaGame(){
        System.out.println("Laptop berhasil membuka game Dota 2");
    }
    public void kirimEmail(String email){
        System.out.println("Laptop berhasil mengirim Email ke" + email );
    }
    public void kirimEmail(String email1, String email2){
        System.out.println("Laptop berhasil mengirim Email ke " + email1 + " dan ke " + email2);
    }
}
