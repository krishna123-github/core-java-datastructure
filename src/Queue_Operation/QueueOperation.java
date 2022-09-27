package Queue_Operation;

import java.util.Scanner;

public class QueueOperation {

    Queue queue;

    public QueueOperation(Queue queue) {
        this.queue = queue;
    }

    public void enQueue(int data) {
        if (!queue.isFull()) {
            queue.queueArray[queue.back] = data;
            queue.back = queue.back + 1;
            System.out.println("Data Push in Queue");
        } else {
            System.out.println("Sorry: Queue is full");
        }
    }

    public Integer deQueue() {
        if (!queue.isEmpty()) {
            int data = queue.queueArray[queue.front];
            queue.back = queue.back - 1;

            int i = 0;
            while (i < queue.queueArray.length - 1) {
                queue.queueArray[i] = queue.queueArray[i + 1];
                queue.queueArray[i + 1] = null;
                i++;
            }
            return data;
        } else {
            System.out.println("Queue is Empty");
            return null;
        }
    }
}

class Test {

    public static void main(String[] args) {
        Queue queue = new Queue(5);
        QueueOperation q = new QueueOperation(queue);
//        Scanner kb = new Scanner(System.in);
//        int data = kb.nextInt();
        q.enQueue(10);
        q.enQueue(20);
        q.enQueue(30);
        q.enQueue(40);
        q.enQueue(50);

        q.enQueue(99);
        Integer data1 = q.deQueue();
        System.out.println("Poped1 = " + data1);
        Integer data2 = q.deQueue();
        System.out.println("Poped2 = " + data2);
        Integer data3 = q.deQueue();
        System.out.println("Poped3 = " + data3);

        q.enQueue(11);
        q.enQueue(22);
        q.enQueue(33);
        q.enQueue(44);
        q.enQueue(44);
        Integer data4 = q.deQueue();
        System.out.println("Poped4 = " + data4);
        Integer data5 = q.deQueue();
        System.out.println("Poped5 = " + data5);
        Integer data6 = q.deQueue();
        System.out.println("Poped6 = " + data6);
        Integer data7 = q.deQueue();
        System.out.println("Poped7 = " + data7);
        Integer data8 = q.deQueue();
        System.out.println("Poped8 = " + data8);
        Integer data9 = q.deQueue();
        System.out.println("Poped8 = " + data9);

        q.enQueue(10);
        q.enQueue(20);
        q.enQueue(30);

        for (int i = 0; i < queue.queueArray.length; i++) {
            System.out.println(queue.queueArray[i]);
        }
        }
    }
