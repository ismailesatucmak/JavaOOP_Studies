public class Main {
    public static void main(String[] args) {
        Vakit vakit = new Vakit();

        vakit.saat=23;
        vakit.dakika=58;
        vakit.saniye=59;

        vakit.vakitYaz();
        vakit.ilerlet();
        vakit.vakitYaz();
        vakit.ilerlet();
        vakit.vakitYaz();
    }
}