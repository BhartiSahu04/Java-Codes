package StringBuffer;

public class appendMethod {

    public static void main(String[] args) {

//        public StringBuffer append()
//        Accepts any type of argument and appends it at the end of StringBuffer object . This method also
//        increases the capacity if it gets full and the formula used
//         2 * curr_capacity + 2

        StringBuffer obj = new StringBuffer("Hello");
        System.out.println("obj data is :"+obj);
        System.out.println("obj length : "+ obj.length());
        System.out.println("obj capacity is :"+obj.capacity());

        obj.append(" user How are you ! ");
        System.out.println("obj2 data is :"+obj);
        System.out.println("obj2 length is :"+obj.length());
        System.out.println("onj2 data is "+obj.capacity());

        obj.append(" What are you doing ? ");
        System.out.println("obj2 data is :"+obj);
        System.out.println("obj2 length is :"+obj.length());
        System.out.println("onj2 data is "+obj.capacity());

    }
}
