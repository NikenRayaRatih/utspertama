import pengguna.User;
import pengguna.Mhs;

class Main {
    public static void main(String[] args) {
        
        Mhs mhs = new Mhs("username", "password");

        mhs.setNama("Niken Raya Ratih");
        mhs.setNim("G.111.20.0035");
        mhs.setSmt(6);

        System.out.println("Nama Mahasiswa: " + mhs.getNama());
        System.out.println("Nim Mhs: " + mhs.getNim());
        System.out.println("Smt Mhs: " + mhs.getSmt());
        System.out.println("USERNAME: " + mhs.getUsername());
        System.out.println("PASSWORD: " + mhs.getPassword());
    }
}