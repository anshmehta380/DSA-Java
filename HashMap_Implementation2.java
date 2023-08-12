import java.util.*;
public class HashMap_Implementation2 {
    static class HashMap2<K,V>{ // generics
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

        public HashMap2(){
            this.N = 4;
            this.buckets = new LinkedList[4]; // creating a new array of LinkedList
            for(int i=0; i < 4; i++){
                // initially null is stored so in order to store new values we need to create empty lists in each buckets
                this.buckets[i] = new LinkedList<>();
            }
        }
        private int hashFunction(K key){
            // "%" is used because the data index should always be lesser than the no. of buckets suppose if N=5 then n=4. N>n always satisfies
            // return Positive 0 - (N-1)
            return Math.abs(key.hashCode())%N;
        }
        private int searchInLL(K key,int bi){
            // taking the linked list stored at bucket index
            LinkedList<Node> ll = buckets[bi];
            int di = 0;
            for(int i = 0; i<ll.size();i++){
                if(ll.get(i)==key){
                    return i;
                }
            }
            return -1;
        }
        private void rehash(){
            LinkedList<Node>[] oldBucket = buckets;
            buckets = new LinkedList[N*2];
            for(int i = 0; i < N*2; i++){
                buckets[i] = new LinkedList<>();
            }
            for(int i = 0; i<buckets.length;i++){
                LinkedList<Node> ll = oldBucket[i];
                for(int j = 0; j < ll.size(); j++){
                    Node node = ll.get(j);
                    put(node.key,node.value);
                }
            }
        }
        // time complexity - O(lambda) or we can say O(1) for average case and for worst - O(n)
        public void put(K key, V value){
            int bi = hashFunction(key); // bucket index
            int di = searchInLL(key,bi); // data index, "-1" means key doesn't exists
            if(di == -1){
                buckets[bi].add(new Node(key,value));
                n++; // 'n' increments with each new node added
            }
            else{
                // if the key exists in the map
                Node data = buckets[bi].get(di);
                // update the value with the new value
                data.value = value;
            }
            double lambda = (double)n/N;
            if(lambda > 2.0){
                rehash();
            }
        }
        public boolean containsKey(K key){
            int bi = hashFunction(key); // bucket index
            int di = searchInLL(key,bi); // data index, "-1" means key doesn't exists
            // if key exists it means condition is true else false
            return di != -1;
        }
        public V remove(K key){
            int bi = hashFunction(key); // bucket index
            int di = searchInLL(key,bi); // data index, "-1" means key doesn't exists
            if(di == -1){
                return null;
            }
            else{
                Node data = buckets[bi].remove(di);
                return data.value;
            }
        }
        public V get(K key){
            int bi = hashFunction(key); // bucket index
            int di = searchInLL(key,bi); // data index, "-1" means key doesn't exists
            if(di == -1){
               return null;
            }
            else{
                Node data = buckets[bi].get(di);
                // update the value with the new value
                return data.value;
            }
        }
        public ArrayList<K> keySet(){
            ArrayList<K> keys = new ArrayList<>();
            for(int i =0; i<buckets.length; i++){ // bi
                LinkedList<Node> ll = buckets[i];
                for(int j = 0; j < ll.size(); j++){ // di  
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
        HashMap2<String,Integer> ans = new HashMap2<>();
        ans.put("India",100);
        ans.put("China",200);
        ans.put("Russia",300);
    }
}
