package LambdaEx;


public class LambdaEx02 {
    @FunctionalInterface
    public interface MyFuncInterface {
        public void func(int x);
    }

    public static void main(String[] args) {
        MyFuncInterface mfi = (x) ->{
            System.out.println(x);
        };

        mfi.func(10);
        mfi.func(20);
        mfi.func(30);
    }

}

