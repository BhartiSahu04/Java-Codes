package StringBuffer;

public class capacityMethod {

    public static void main(String[] args) {

//        public int capacity():
//        Returns the Total Space reserved by the StringBuffer object

        StringBuffer obj = new StringBuffer("HEllo");
        System.out.println("obj data is :"+obj);
        System.out.println("obj length : "+ obj.capacity());
        StringBuffer obj2 = new StringBuffer("HEllo Bharti");
        System.out.println("obj data is :"+obj2);
        System.out.println("obj length : "+ obj2.capacity());




    }
}
