package StringBuffer;

public class reverseMethod {

    public static void main(String[] args) {

//        public StringBuffer reverse()
//        Performs an in place reversal of the contents of the StringBuffer object
        StringBuffer obj = new StringBuffer("HEllo");
        System.out.println("obj data is :"+obj);
        System.out.println("obj length : "+ obj.length());
        System.out.println("obj capacity is :"+obj.capacity());

        obj.reverse();
        System.out.println("obj2 data is :"+obj);
        System.out.println("obj2 length is :"+obj.length());
        System.out.println("onj2 data is "+obj.capacity());
        System.out.println(obj.reverse());

    }
}
