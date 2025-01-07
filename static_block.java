public class static_block {
    public static void main(String[] args) 
    {
        test t1 = new test();
        System.out.println("main");
    }
    
}

class test{
    static 
    {
        System.out.println("Block 1");
    }
    static 
    {
        System.out.println("Block 2");
    }
}
