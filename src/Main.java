import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        OperatorStack op_stack = new OperatorStack(100);

//        System.out.print("Enter your equation: ");
//        String eq = scanner.next();
        String eq = "7+2-5*3/2*3-5";

        String post = getPost(eq);

    }
    public static String getPost(String eq){
        for (int i = 0; i < eq.length(); i++) {
            char ch = eq.charAt(i);
            if (ch)
        }
        return "";
    }

}
