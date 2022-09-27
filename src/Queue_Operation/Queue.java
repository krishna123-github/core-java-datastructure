package Queue_Operation;

public class Queue {

    Integer[] queueArray;
    int front;
    int back;
    int size;

    public Queue(int size) {
        this.size = size;
        queueArray = new Integer[size];
        front = -1;
        back = -1;
    }
    
    public Integer peak(){
        return queueArray[front];
    }
    
    public Boolean isFull(){
        if(back == size){
            return true;
        }
        else{
            if(front == -1  && back == -1){
                front = back = 0;
            }
            return false;
        }
    }
    public Boolean isEmpty(){
        if(front == back){
            if(front == 0 && back == 0){
                front = back = -1;
            }
            return  true;
           
        }
        else{
            return false;
        }
    }
}
