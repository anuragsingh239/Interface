public interface Interface {
    void anurag();
}
interface anu{
    void aa();
}
class a1 implements Interface,anu{
    public void anurag(){
        System.out.println("this is the first interface class");
    }

    @Override
    public void aa() {
        System.out.println("this is the second interface");
    }

    public static void main(String[] args) {
        a1 obj=new a1();
        obj.anurag();
        obj.aa();
    }
}
