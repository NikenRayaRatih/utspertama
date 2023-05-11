class Main {
    public static void main(String[] args) {

         Mhs mhs = new Mhs(username:"ini_username"), password:"ini_password" ;

         mhs.setNama(nama:"Niken Raya Ratih");
         mhs.setNim(nim:"G111200035");
         mhs.setSmt(smt:6);

         System.out.println("Nama Mhs: " + mhs.getNama());
         System.out.println("Nim Mhs: " + mhs.getNim());
         System.out.println("Smt Mhs: " + mhs.getSmt());
         System.out.println("Username: " + mhs.getUsername());
         System.out.println("Password: " + mhs.getPassword());
    }
}