
package Stack_Operation;

public class Stack {
    Integer[] stackArray ;
    Integer maxSize;
    Integer top ;

    public Stack(int maxSize) {
        this.maxSize = maxSize;
        stackArray= new Integer[maxSize];
        top = -1;    // In empty stackArray the Base index is -1 beacause new element innsert at new top index ..for initial  element the index will ++top is equals to 0.
    }
    
    Integer peek(){
        return stackArray[top];
    }
    
    Boolean isFull(){
        if(top == maxSize-1){ 
            return  true;
        }
        else{
            return  false;
        }
    }
    
    Boolean isEmpty(){
        if(top == -1){
            return true;
        }else{
            return false;
        }
    }
}
