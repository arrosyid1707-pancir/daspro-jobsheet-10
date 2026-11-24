import java.util.Scanner;

public class BioskopWithScanner01mod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int baris, kolom;
        String nama;
        String[][] penonton = new String[4][2];

        while(true){
            System.out.println("\n====== Daftar menu ======");
            System.out.println("1. Input data penonton");
            System.out.println("2. Menampilkan data penonton");
            System.out.println("3. Exit");
            System.out.print("Masukkan menu : ");
            int menu=sc.nextInt();
            sc.nextLine();
            
           if(menu==1){
            while(true){
                System.out.print("Masukkan nama : ");
                nama=sc.nextLine();

                while (true) {
                    System.out.print("Masukkan baris : ");
                    baris=sc.nextInt();
                    sc.nextLine();
                    System.out.print("Masukkan kolom : ");
                    kolom=sc.nextInt();
                    sc.nextLine();

                    if(baris>penonton.length||baris<1||kolom>penonton[0].length||kolom<1){
                        System.out.println("Baris atau kolom tidak tersedia! silahkan masukkan lagi");

                    }else if(penonton[baris-1][kolom-1]!=null){
                        System.out.println("Baris ke-" + (baris) + " kolom ke-" + (kolom-1) + " sudah terisi oleh " + penonton[baris-1][kolom-1]);

                    }else {
                        penonton[baris-1][kolom-1]=nama;
                        break;
                    }   
                }

                System.out.print("Lanjut memasukkan nama? (y/t) : ");
                String lanjut = sc.nextLine();
                if(lanjut.equalsIgnoreCase("t")){
                    break;
                }
            }
           }else if(menu==2){
            for(int i=0; i<penonton.length; i++){
                System.out.print("\nPenonton baris ke-"+(1+i)+ ": ");

                for(int y=0; y<penonton[i].length; y++){
                    String menampilkan = (penonton[i][y]!=null)?penonton[i][y]:"***";
                    System.out.print(menampilkan +  "  ");
                }
            }
           }else if(menu==3){
            break;

           }else{
            System.out.println("Meu tidak tersedia");
           }
        }
        sc.close();
    }
}
