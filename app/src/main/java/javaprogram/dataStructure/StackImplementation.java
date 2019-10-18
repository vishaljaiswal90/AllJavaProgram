package javaprogram.dataStructure;


//Question 1:  Implement a stack using array.
public class StackImplementation {
    int array [];
    int size;
    int top;

    public StackImplementation(int size) {
        this.size = size;
        this.array =  new int[size];
        this.top =  -1;
    }


    // push operation

    public void push(int pushElement){
        if (!isFull()){
            top++;
            array[top] = pushElement;
            System.out.println("pushed Element " + pushElement);
        }else {
            System.out.println("Stack is full");
        }
    }

    private int pop(){
        if (!isEmpty()){
            int returnTop =  top;
            top --;
            System.out.println("Popped element :" + array[returnTop]);
            return array[returnTop];
        }else {
            System.out.println("Stack is empty");
            return  -1;
        }
    }

    private int pik(){
        if (!isEmpty()){
            return array[top];
        }else {
            System.out.println("No element  in stack ");
            return -1;
        }
    }


    private boolean isEmpty (){
        return (top == -1);
    }

    private boolean isFull(){
        return (size -1 == top);
    }

    private void printArrayData(){
        if (!isEmpty()){
            System.out.println( array.length +" ");
            for (int i = 0; i<array.length;i++){
                System.out.print(array[i]+" ");
            }
        }else {
            System.out.println("No element  in stack ");
        }
    }

    public static void main(String [] args){
        StackImplementation stackImplementation =  new StackImplementation(10);
        stackImplementation.pop();
        System.out.println("=================");
        stackImplementation.push(10);
        stackImplementation.push(30);
        stackImplementation.push(50);
        stackImplementation.push(40);
        System.out.println("=================");
        stackImplementation.pop();
        stackImplementation.pop();
        stackImplementation.pop();
        System.out.println("=================");
        stackImplementation.push(10);
        stackImplementation.push(30);
        stackImplementation.push(50);
        stackImplementation.push(40);
        System.out.println("=================");

        stackImplementation.printArrayData();

        stackImplementation.pik();
        System.out.println("=================");




    }
}
