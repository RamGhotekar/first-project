public class HelloWorld
{
    public int add(int i, int j)
    {
        return i+j;
    }
    public static void main(String[] args)
    {
        System.out.println("Hello World");
        System.out.println();

        HelloWorld obj= new HelloWorld();
        int result = obj.add(4,3);
        System.out.println(result);

    }


}
