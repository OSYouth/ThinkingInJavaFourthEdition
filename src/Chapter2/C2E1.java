package Chapter2;

public class C2E1{
    public static void main(String[] args) {
        ExampleObject exampleObject = new ExampleObject();
        System.out.println(exampleObject.i);        
        System.out.println(exampleObject.o);
    }
}

class ExampleObject{
    int i;
    char c;
}