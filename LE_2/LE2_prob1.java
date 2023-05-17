class child extends Mother
{
    //Empty Body
}

class Main
{
    public static void main(String args[])
    {
        Mother m=new Mother();
        m.show();
        child ch=new child();
        ch.show();
    }
}

class Mother
{
    int x;
    void show()
    {
        System.out.println(x);
    }
}
