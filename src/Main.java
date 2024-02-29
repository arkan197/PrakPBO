import java.util.Scanner;

class LibrarySystem {
    private final String adminUsername = "admin";
    private final String adminPassword = "admin123";
    private final String mahasiswaNIM = "123456789012345";
    private final int panjangNIM = 15;

    public boolean loginAdmin(String username, String password) {
        return username.equals(adminUsername) && password.equals(adminPassword);
    }

    public boolean loginMahasiswa(String nim) {
        return nim.length() == panjangNIM && nim.matches("\\d+");
    }
}

public class Main {
    public static void main(String[] args) {
        LibrarySystem librarySystem = new LibrarySystem();
        Scanner scanner = new Scanner(System.in);

        // Login sebagai admin
        System.out.println("===Library System===");
        System.out.println("1.Login as Student");
        System.out.println("2.Login as Admin");
        System.out.println("3.Exit");
        System.out.print("Choose option: ");
        int option = scanner.nextInt();
        switch (option){
            case 1:
                System.out.print("Enter your NIM: ");
                String mahasiswaNIMInput = scanner.next();
                if (librarySystem.loginMahasiswa(mahasiswaNIMInput)) {
                    System.out.println("Succesfully login as Student");
                } else {
                    System.out.println("User not found");
                }
                break;
            case 2:
                System.out.print("Masukkan username admin: ");
                String adminUsernameInput = scanner.next();
                System.out.print("Masukkan password admin: ");
                String adminPasswordInput = scanner.next();

                if (librarySystem.loginAdmin(adminUsernameInput, adminPasswordInput)) {
                    System.out.println("Login Admin Berhasil");
                } else {
                    System.out.println("Login Admin Gagal");
                }
                break;
            case 3:
                System.out.println("Thank you!");
                break;
        }

    }
}
