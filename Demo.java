class Demo {
    String msg1 = "Hello, I am in Demo class!";
    void show()
    {
        System.out.println(msg1);
    }
}
class Work extends Demo{
    String msg2;
    Work(String msg){
        msg2 = msg;
    }
    void show(){
        System.out.println(msg1+"\n"+msg2);
    }
}
class Main{
    public static void main(String[] args) {
        System.out.println("Just messing around in git and Github.");
        Work w = new Work("I am in Inherited Class");
        w.show();
    }
}
