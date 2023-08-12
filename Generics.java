import java.util.ArrayList;

class generic<T1, T2>{
    int val;
    private T1 t1;
    private T2 t2;

    public generic(int val,T1 t1,T2 t2){
        this.val = val;
        this.t1 = t1;
        this.t2 = t2;
    }

    public T2 getT2() {
        return t2;
    }

    public void setT2(T2 t2) {
        this.t2 = t2;
    }

    public int getVal(){
        return val;
    }
    public void setVal(){
        this.val = val;
    }

    public T1 getT1(){
        return t1;
    }
    public void setT1(){
        this.t1 = t1;
    }
}
public class Generics {
    public static void main(String[] args) {
        // here Integer is a generic
        ArrayList<Integer> arrayList = new ArrayList();
//        arrayList.add("str1"); - cannot store a string in an Integer ArrayList
        arrayList.add(54);
        arrayList.add(643);
        generic<String,Integer> g1 = new generic(10,"Ansh",10);
        String str = g1.getT1();
        Integer val = g1.getT2();
        System.out.println(str+val);
    }
}
