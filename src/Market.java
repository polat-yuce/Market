import java.util.Scanner;

public class Market {
    public static void main(String[] args) {

        String[] urunIsimleri = {"Ekmek", "Un", "Süt", "Karpuz"};
        double[] urunFiyatlari = {10.0, 20.0, 15.0, 25.0};
        int[] urunStoklari = {5, 8, 3, 10};

        Scanner oku = new Scanner(System.in);

        while (true)
        {
            System.out.println("Ürünler:");

            for (int i = 0; i < urunIsimleri.length; i++) {
                System.out.println((i + 1) + ". " + urunIsimleri[i] + " - Fiyat: " + urunFiyatlari[i] + " TL - Stok: " + urunStoklari[i]);
            }

            System.out.print("Alışveriş yapmak istediğiniz ürünün numarasını girin (Çıkış için 0):");
            int secilenUrunNo = oku.nextInt();

            if (secilenUrunNo == 0) {
                System.out.println("Alışverişten çıkılıyor. İyi günler!");
                break;
            }

            if (secilenUrunNo > 0 && secilenUrunNo <= urunIsimleri.length) {
                int index = secilenUrunNo - 1;
                System.out.println("Güncel stok durumu: " + urunStoklari[index]);
                System.out.println("Kaç adet almak istiyorsunuz?");
                int alinanMiktar = oku.nextInt();

                if (urunStoklari[index] >= alinanMiktar) {
                    double toplamFiyat = urunFiyatlari[index] * alinanMiktar;
                    urunStoklari[index] -= alinanMiktar;

                    System.out.println("Ürün adı: " + urunIsimleri[index]);
                    System.out.println("Alınan miktar: " + alinanMiktar);
                    System.out.println("Toplam fiyat: " + toplamFiyat + " TL");
                } else {
                    System.out.println("Üzgünüz, " + urunIsimleri[index] + " ürününden yeterli stok bulunmamaktadır.");
                    System.out.println("Mevcut stok: " + urunStoklari[index]);
                }
            } else {
                System.out.println("Geçersiz ürün numarası!");
            }

            System.out.println("Yeni bir alışveriş yapmak ister misiniz? (Evet için 1, Hayır için 0)");
            int devamEt = oku.nextInt();

            if (devamEt == 0) {
                System.out.println("Alışverişten çıkılıyor. İyi günler!");
                break;
            }
        }


    }


}

