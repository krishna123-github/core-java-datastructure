package Stack_Operation;

public class StackOperation {

    Stack stack;

    public StackOperation(Stack s) {
        stack = s;
    }

    public void push(int data) {
        if (!stack.isFull()) {
            stack.top = stack.top + 1;
            stack.stackArray[stack.top] = data;
        } else {
            System.out.println("Sorry data cant insert..stack is full");
        }
    }

    public Integer pop() {
        if (!stack.isEmpty()) {
            int data = stack.stackArray[stack.top];
            stack.stackArray[stack.top] = null;
            stack.top = stack.top - 1;
            return data;
        } else {
            System.out.println("Sorry stack is emplty...there is no data");
            return null;
        }
    }

}

class Test {

    public static void main(String[] args) {
        Stack stack = new Stack(5);
        StackOperation opr = new StackOperation(stack);
        opr.push(10);
        opr.push(20);
        opr.push(30);
        opr.push(40);
        opr.push(50);
//
//        for (int i = 0; i <= stack.top; i++) {
//            System.out.println(stack.stackArray[i]);
//        }
//
//        opr.push(60);

        Integer data = opr.pop();
        System.out.println("1-Poped items1 = " + data);
        Integer data1 = opr.pop();
        System.out.println("2-Poped items2 = " + data1);
        for (int i = 0; i <= stack.top; i++) {
            System.out.println(stack.stackArray[i]);
        }
    }
}
