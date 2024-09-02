
import java.util.Scanner;

public class tesSiswa {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("nama");
        String nama = in.nextLine();
        System.out.println("id");
        int id = in.nextInt();
        System.err.println("ipk");
        double ipk = in.nextDouble();

        siswa zidane = new siswa(id , nama, ipk);
        //nilai diatas 75 lulus
        if(zidane.getIpk() >= 75){
            System.out.println(zidane.getNama() + " Lulus bosss ");
        }else{
            System.out.println(zidane.getNama() + " Tidak lulus bosss ");
        }

        //nilai huruf
        if(zidane.getIpk() < 60){
            System.out.println("Mendapatkan nila E");
        }else if (zidane.getIpk() > 60 && zidane.getIpk() <= 70){
            System.out.println("Mendapatkan nilai D");
        }else if (zidane.getIpk() >71 && zidane.getIpk() <= 80){
            System.out.println("Mendapatkan nilai C");
        }else if (zidane.getIpk() > 81 && zidane.getIpk() <= 90){
            System.out.println("Mendapatkan nilai B");
        }else if (zidane.getIpk() > 91 && zidane.getIpk() <= 100){
            System.out.println("Mendapatkan nilai A");
        }

        // if(zidane.getIpk() <)
        in.close();

        // siswa zidane = new siswa();
        // siswa el = new siswa();

        // siswa wleowleo = new siswa(10, "wleowleo", 100);
        // siswa bayu = new siswa(id,nama,ipk);

        // zidane.id = 16;
        // zidane.nama = "zidane";
        // zidane.ipk = 100;

        // System.out.println("Data diri zidane: ");
        // System.out.println("id: " + zidane.id);
        // System.out.println("nama: " + zidane.nama);
        // System.out.println("ipk: " + zidane.ipk);
        // System.out.println("Data diri el: ");
        // System.out.println("id: " + el.id);
        // System.out.println("nama: " + el.nama);
        // System.out.println("ipk: " + el.ipk);

        // zidane.print();
        // el.print();
        
    }
}