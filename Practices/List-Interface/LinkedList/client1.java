interface  Car {
    void engine();
}
class mahindra implements Car{
   mahindra m;
   mahindra getCar(String s){
       if (s.equals("thar")){
           m= new thar();
       }else m = new scarpio();
       return m;
   }
    @Override
    public void engine() {
        System.out.println("start engine");
    }
}
class thar extends mahindra{
    public void colour(){
        System.out.println("black");
    }
}
class scarpio extends mahindra{
    public void colour(){
        System.out.println("white");
    }
}
class tata implements Car {

    @Override
    public void engine() {
        System.out.println("start engine");

    }
}
class safari extends tata{
    public void colour(){
        System.out.println("white");
    }
}
class nexon extends tata{
    public void colour(){
        System.out.println("black");
    }
}
class suzuki implements Car{

    @Override
    public void engine() {
        System.out.println("start engine");
    }
}
class swift extends suzuki{
    public void colour(){
        System.out.println("light blue");
    }
}
class baleno extends suzuki{
    public void colour(){
        System.out.println("navi blue");
    }
}
class hyundai implements Car{

    @Override
    public void engine() {
        System.out.println("start engine");
    }
}
class  i20 extends hyundai{
    public void colour(){
        System.out.println("red");
    }
}
class verna extends hyundai{
    public void colour(){
        System.out.println("red");
    }
}
class factor {
    Car c;
    Car getFactor(String s){
    if (s.equals("mahindra")){
        c=   new mahindra();
    }
        else if(s.equals("tata")){
        c = new tata();
    } else if (s.equals("suzuki")) {
        c= new suzuki();
    }
        else m= new hyundai();
        return c;
}


}
public  class client1{

}