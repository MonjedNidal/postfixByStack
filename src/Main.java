public class Main {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);

//        System.out.print("Enter your equation: ");
//        String eq = scanner.next();
        String eq = "7+2-5*3/2*3-5";
        System.out.println(getPost(eq));

    }
    public static StringBuilder getPost(String eq){
        OperatorStack stack = new OperatorStack(100);
        StringBuilder post = new StringBuilder();
        for (int i = 0; i < eq.length(); i++) {
            char ch = eq.charAt(i);
            switch (getType(ch)){
                case 1:
                    post.append(ch);
                    break;
                case 2:
                    while (!stack.isEmpty() && priority(ch) <= priority(stack.peek())){
                        post.append(stack.pop());
                    }
                    stack.push(ch);
                    break;
                default:
            }
        }
        while (!stack.isEmpty()){
            post.append(stack.pop());
        }
        return post;
    }

    private static int priority(char ch) {
        if (ch == '+' || ch == '-'){
            return 2;
        }else if (ch == '*' || ch == '/'){
            return 3;
        }
        return 0;
    }

    private static int getType(char ch) {
        if (ch >= '0' && ch <= '9'){
            return 1;
        } else if (ch == '+' || ch == '-' || ch == '*' || ch == '/') {
            return 2;
        }
        return 0;
    }

}
