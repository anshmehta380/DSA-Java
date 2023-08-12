import java.util.*;
import java.util.LinkedList;
public class HashMap_Implementation2 {
    static class HashMap<V,K>{ // generics
        private class Node{
            K key;
            V value;

            public Node(K key,V value){
                this.key = key;
                this.value = value;
            }
        }
        private int n; // n - node
        private int N; // N - Buckets
        private LinkedList<Node>[] buckets; // N = buckets.length

        public HashMap(){
            this.N = 4;
            this.buckets = new LinkedList[4]; // creating a new array of LinkedList
            for(int i=0; i < 4; i++){
                // initially null is stored so in order to store new values we need to create empty lists in each buckets
                this.buckets[i] = new LinkedList<>();
            }
        }
    }

    public static void main(String[] args) {

    }
}
