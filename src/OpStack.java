public class OpStack {

        char[] stack;
        int top;

        public OpStack(int n) {
            stack = new char[n];
            top = -1;
        }

        public boolean isEmpty(){
            return top == -1;
        }

        public boolean isFull(){
            return top == stack.length-1;
        }

        public void push (char ch){
            if (!isFull()){
                stack[++top] = ch;
            }
        }

        public char pop (){
            if (!isEmpty()){
                return stack[top--];
            }return ' ';
//            }else {
//                System.out.println("Stack is empty");
//            }
        }

        public char peek(){
            if (!isEmpty()){
                return stack[top];
            }return ' ';
        }


}


