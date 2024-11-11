package oopCollectingg;

public class Queues {

}

class QLink{
    int data;
    QLink next;
}

class LinkingQueue{
    QLink start;
    QLink end;

    void enqueue(int data){
        if (start == null){ //queue je prázdná
            start = new QLink();
            start.data = data;
            end = start;
        }
        end.next = new QLink();
        end.next.data = data;
        end = end.next;
    }

    int dequeue(){
        return 0;
    }


}
