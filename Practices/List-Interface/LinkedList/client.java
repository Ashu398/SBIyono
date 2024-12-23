 interface Milk {
    void milk();
}
class Icecream implements Milk{
    @Override
    public void milk() {
        System.out.println("Here is your Icecream");
    }
}
class cheese implements Milk{

    @Override
    public void milk() {
        System.out.println("Here is your cheese");
    }
}
class butter implements Milk{

    @Override
    public void milk() {
        System.out.println("Here is your Butter");
    }
}
class Panner implements Milk{

    @Override
    public void milk() {
        System.out.println("Here is your Panner");
    }
}
class Amul{

         }
public class client{

 }