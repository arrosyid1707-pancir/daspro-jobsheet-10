
import java.util.Scanner;

public class TugasMandiri01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final int jmlResponden = 10;
        final int jmlPertanyan = 6;

        int[][] survei = new int[jmlResponden][jmlPertanyan];

        double totalKeseluruhan = 0;

        System.out.println("======================================");
        System.out.println("       PROGRAM HASIL SURVEI");
        System.out.println("======================================");
        System.out.println("Masukkan nilai jawaban antara 1 - 5");

        
        for (int i = 0; i < survei.length; i++) {
            System.out.println("\nResponden ke-" + (i + 1));

            for (int j = 0; j < survei[i].length; j++) {
                System.out.print("Pertanyaan ke-" + (j + 1) + ": ");
                survei[i][j] = sc.nextInt();

                while (survei[i][j] < 1 || survei[i][j] > 5) {
                    System.out.println("Nilai harus antara 1 sampai 5!");
                    System.out.print("Masukkan kembali: ");
                    survei[i][j] = sc.nextInt();
                }
            }
        }

        System.out.println("\n======================================");
        System.out.println(" RATA-RATA SETIAP RESPONDEN");
        System.out.println("======================================");

        for (int i = 0; i < survei.length; i++) {
            double totalResponden = 0;

            for (int j = 0; j < survei[i].length; j++) {
                totalResponden += survei[i][j];
            }

            double rataRata = totalResponden / survei[i].length;
            System.out.printf("Responden ke-%d: %.2f%n", (i + 1), rataRata);
            totalKeseluruhan += totalResponden;
        }

        System.out.println("\n======================================");
        System.out.println(" RATA-RATA SETIAP PERTANYAAN");
        System.out.println("======================================");

        for (int j = 0; j < survei[0].length; j++) {
            double totalPertanyaan = 0;

            for (int i = 0; i < survei.length; i++) {
                totalPertanyaan += survei[i][j];
            }

            double rataRata = totalPertanyaan / survei.length;
            System.out.printf("Pertanyaan ke-%d: %.2f%n", (j + 1), rataRata);
        }

        double rataRataKeseluruhan = totalKeseluruhan / (jmlResponden * jmlPertanyan);

        System.out.println("\n======================================");
        System.out.println(" RATA-RATA KESELURUHAN");
        System.out.println("======================================");

        System.out.printf("Rata-rata seluruh survei: %.2f%n", -rataRataKeseluruhan);

        sc.close();
    }
}
