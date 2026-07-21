class B {
    void show() 
    {
        System.out.println("Method from class B");
    }
}

class Sample {

    private B b;
    public Sample(B b) 	// constructor 
    {
        this.b = b;
    }

    public void test()
    {
        b.show();
    }

    public static void main(String[] args)
    {
        B objB = new B();
        Sample obj = new Sample(objB);
        obj.test();
    }
}