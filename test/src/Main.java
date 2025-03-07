public class Main
    {
    public void method1()
        {
        System.out.println("foo 1");
        }

    public void method2()
        {
        System.out.println("foo 2");
        }

    public String toString()
        {
        return "foo";
        }
    }

class Bar extends Main
    {
    public void method2()
        {
        System.out.println("bar 2");
        }
    }

class Baz extends Main
    {
    public void method1()
        {
        System.out.println("baz 1");
        }

    public String toString()
        {
        return "baz";
        }
    }

class Mumble extends Baz
    {
    public void method2()
        {
        System.out.println("mumble 2");
        }
    }

class Driver2
    {
    public static void main(String[] args)
        {
        Main[] pity = {new Baz(), new Bar(), new Mumble(), new Main()};// declaring an array in java named pity and elements are the func
        //Baz, Bar, Mumble, Main
        //every time Baz is called it prints the Baz function and goes down the line
        for (int i = 0; i < pity.length; i++)
            {
            System.out.println(pity[i]);
            pity[i].method1();
            pity[i].method2();
            System.out.println();
            }
        }
    }

 class Lamb extends Ham
    {
    public void b()
        {
        System.out.print("Lamb b   ");
        }
    }

class Ham
    {
    public void a()
        {
        System.out.print("Ham a   ");
        b();
        }

    public void b()
        {
        System.out.print("Ham b   ");
        }

    public String toString()
        {
        return "Ham";
        }
    }

class Spam extends Yam
    {
    public void b()
        {
        System.out.print("Spam b   ");
        }
    }

class Yam extends Lamb
    {
    public void a()
        {
        System.out.print("Yam a   ");
        super.a();
        }

    public String toString()
        {
        return "Yam";
        }
    }

class Driver
    {
    public static void main(String[] args)
        {
        Ham[] food = {new Lamb(), new Ham(), new Spam(), new Yam()};
        for (int i = 0; i < food.length; i++)
            {
            System.out.println(food[i]);
            food[i].a();
            System.out.println();     // to end the line of output
            food[i].b();
            System.out.println();     // to end the line of output
            System.out.println();
            }
        }
    }
