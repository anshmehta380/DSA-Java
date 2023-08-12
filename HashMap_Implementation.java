import jdk.dynalink.beans.StaticClass;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;

public class HashMap_Implementation {
    static class HashMap<K,V>{ // generics
        private class Node{
            K key;
            V value;
            public Node(K key,V value){
                this.key = key;
                this.value = value;
            }
        }
        private int n;
        private int N;
        //public int arr[];
        private LinkedList<Node> buckets[]; //N = buckets.length

        // Invoking the constructor of HashMap class
        public HashMap(){
            this.N = 4;
            // Initializing the array
            this.buckets = new LinkedList[4];
            for(int i = 0; i < 4; i ++){
                this.buckets[i] = new LinkedList<>();
            }
        }
        private int hashFunction(K key){
            int bi = key.hashCode();
            return Math.abs(bi) % N;
        }

        private int searchInLL(K key, int bi){
            LinkedList<Node> ll = buckets[bi];
            int di = 0;
            for(int i = 0; i < ll.size(); i++){
                if(ll.get(i).key == key){
                    return i;
                }
            }
            return -1;
        }
        private void rehash(){
            LinkedList<Node> oldBucket[] = buckets;
            buckets = new LinkedList[N*2];

            for(int i = 0; i < N*2; i++){
                buckets[i] = new LinkedList<>();
            }
            for(int i = 0; i < oldBucket.length; i++){
                LinkedList<Node> ll = oldBucket[i];
                for(int j = 0; j < ll.size(); j++){
                    Node node = ll.get(j);
                    put(node.key, node.value);
                }
            }
        }
        public void put(K key, V value){
            // Find the bucket index first in order to check whether the key exists or not
            int bi = hashFunction(key);
            // (key,bucketIndex) - Now that you know the bucket index find the data index at which index of the linked list does the key exists for that bucket index.
            // [bucket 0][bucket 1][bucket 2]
            // new LinkedList[0],new LinkedList[0],new LinkedList[0]
            int di = searchInLL(key,bi); // data index = 1

            if(di == -1){ // Key doesn't exist
                // then add that new key in that bucket index and increment n
                buckets[bi].add(new Node(key,value));
                n++;
            } // key exists
            else{
                // in this case take out the data
                Node node = buckets[bi].get(di);
                node.value = value;
            }

            double lambda = (double)n/N;
            if(lambda > 2.0){
                // rehashing
                rehash();
            }
        }
        public V get(K key){
            int bi = hashFunction(key);
            int di = searchInLL(key,bi); // data index = 1

            if(di == -1){ // Key doesn't exiss
                return null;
            } // key exists
            else{
                Node node = buckets[bi].get(di);
                return node.value;
            }
        }
        public boolean contiansKey(K key){
            int bi = hashFunction(key);
            int di = searchInLL(key, bi);

            if(di == -1){
                return false;
            }else{
                return true;
            }
        }
        public V remove(K key){
            int bi = hashFunction(key);
            int di = searchInLL(key, bi);

            if(di == -1){
                return null;
            }else{
                Node node = buckets[bi].remove(di);
                n--;
                return node.value;
            }
        }
        public ArrayList<K> keySet(){
            ArrayList<K> keys = new ArrayList<>();
            for(int i = 0; i< buckets.length; i++){
                LinkedList<Node> ll = buckets[i];
                for(int j = 0; j < ll.size(); j++){
                    Node node = ll.get(j);
                    keys.add(node.key);
                }
            }
            return keys;
        }
        public boolean isEmpty(){
            return n == 0;
        }
    }
    public static void main(String[] args) {
        // Internal implementation of HashMap in java is done as Array of Linked List
        HashMap<String, Integer> map = new HashMap<>();
        map.put("India",120);
        map.put("china",150);
        map.put("USA",50);
        ArrayList<String> keys = map.keySet();
        for(int i = 0; i < keys.size();i++){
            System.out.println(keys.get(i)+" "+map.get(keys.get(i)));
        }
        map.remove("India");
        System.out.println(map.get("India"));
    }
}
