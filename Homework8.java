import java.util.HashMap;
import java.util.Scanner;

public class Homework8 {

    public static void main(String[] args) {
        HashMap<String, String> userCredentials = new HashMap<>();
        userCredentials.put("myId", "myPass");
        userCredentials.put("myId2", "myPass2");
        userCredentials.put("myId3", "myPass3");

        Scanner scanner = new Scanner(System.in);

        System.out.println("id와 password를 입력해주세요.");

        while (true) {
            System.out.print("id : ");
            String enteredId = scanner.nextLine().trim();

            if (!userCredentials.containsKey(enteredId)) {
                System.out.println("입력하신 id는 존재하지 않습니다. 다시 입력해주세요.");
                continue;
            }

            System.out.print("password : ");
            String enteredPassword = scanner.nextLine().trim();

            String storedPassword = userCredentials.get(enteredId);

            if (enteredPassword.equals(storedPassword)) {
                System.out.println("id와 비밀번호가 일치합니다.");
                break;
            } else {
                System.out.println("비밀번호가 일치하지 않습니다. 다시 입력해주세요.");
            }
        }

        scanner.close();
    }
}
