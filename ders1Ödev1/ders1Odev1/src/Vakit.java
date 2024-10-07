public class Vakit {
    public int saat;
    public int dakika;
    public int saniye;

    public void ilerlet (){
        saniye++;
        if(saniye==60){
            dakika++;
            saniye=0;
        }
        if (dakika==60){
            saat++;
            dakika=0;
        }
        if (saat==24){
            saat=0;
            dakika=0;
            saniye=0;
        }
    }
    public void vakitYaz(){
        String yaniSaat = String.format("%02d",saat);
        String yaniDakika = String.format("%02d",dakika);
        String yaniSaniye = String.format("%02d",saniye);

        System.out.printf("Vakit : "+yaniSaat+":"+yaniDakika+":"+yaniSaniye);
        System.out.println("");
    }
}
