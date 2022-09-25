public class DefaultImpl implements DefaultMethodInterface {

    public static void main(String[] args) {

        DefaultMethodInterface d = new DefaultImpl();
        //method() is static in DefaultMethodInterface
        d.method();// not allowed

        DefaultMethodInterface.method();//only this way is allowed
    }
}


interface  A{

    void a();
    default void b(){

    }
}


abstract class B implements A{

    @Override
    public void b() {
        A.super.b();
    }

}

class C extends B{

}