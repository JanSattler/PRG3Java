package oopCollectingg;

import java.util.EmptyStackException;
public class Queues {   //FIFO
    public static void main(String[] args) {
        LinkingQueue<Integer> numbers = new LinkingQueue<>();
        LinkingQueue<Player> players = new LinkingQueue<>();

        players.enqueue(new Player("Jarmil"));
        players.enqueue(new Player("Adam"));
        players.enqueue(new Player("Stein"));
        players.enqueue(new Player("Karel"));
        players.enqueue(new Player("Boris"));
        players.enqueue(new Player("Tom"));

        //v queue je právě jeden prvek
        while (players.start != players.end){
            System.out.println("Právě hraje: " + players.peek().name);
            magicPause();
            Player playerTurn = players.dequeue();  //vrátí dalšího hráče
            if (Math.random() <= .16){
                System.out.println(playerTurn.name + " bohužel");
            } else {
                System.out.println(playerTurn.name + " přežil");
                players.enqueue(playerTurn);
            }
        }

        System.out.println("Last man standing: " + players.peek().name);
    }

    static void magicPause(){
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException();
        }
    }
}


class Player{
    String name;

    public Player(String name) {
        this.name = name;
    }
}

class QLink<E>{
    E data;
    QLink<E> next;
}

class LinkingQueue<E>{
    QLink<E> start;
    QLink<E> end;

    void enqueue(E data){
        QLink<E> newLink = new QLink<>();

        if (start == null){ //queue je prázdná
            start = newLink;
            end = start;
        }
        end.next = newLink;
        end = newLink;
    }

    E peek(){
        if (start == null){
            throw new RuntimeException("Prazdna fronta");
        }
        return start.data;
    }

    E dequeue(){
        if (start == null){ //queue není prázdná
            return null;    //vyhodí ideálně chybu
        }
        E tmp = start.data;
        start = start.next;
        return tmp;
    }


}

class ArrayQueue{
    int[] array;
    int first, count;

    public ArrayQueue(int initialCapacity) {
        this.array = new int[initialCapacity];
        first = 0;
        count = 0;
    }


    void enqueue(int toAdd){
        array[(first+count) % array.length] = toAdd;
        count++;
    }

    int dequeue(){
        int toReturn = array[first];
        if (count > 0){
            first = (first + 1) % array.length; //šoupnu first na first index když je tam volno
            count--;
            return toReturn;

        } else {
            return -1;
        }
    }

    int peek(){
        if (count > 0){
            return array[first];
        }
        else {
            return -1;
        }
    }


    void expandArray(){
        int[] newArray = new int[2 * array.length];
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[(first+1) % array.length];
        }
        array = newArray;
        first = 0;
    }


}
