package diamondoperator;

import java.io.IOException;

public class DiamondOperator {
    public static void p(Object o){
        System.out.println(o);
    }

    public static void main(String[] arg) throws IOException {
    //p("Hello");
        Handler<Integer> intHandler = new Handler<Integer>(1) {
            @Override
            void handle() {
                p(content);
            }
        };
        intHandler.handle();

        Handler<?> stringHandler = new Handler<String>("Abc") {
            @Override
            void handle() {
                p(content);
            }
        };
        stringHandler.handle();



    }
}
