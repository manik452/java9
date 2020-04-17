package streamapi9;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamAPI {

    public static void p(Object o){
        System.out.println(o);
    }

    public static void main(String agr[]){
        List<String> roll = new ArrayList<>();

        for(int i =1;i<=62;i++){
            roll.add("1140"+new DecimalFormat("00").format(i));
        }
        List<String> roll2= roll.stream().dropWhile(s->!s.equals("114040")).collect(Collectors.toList());
        List<String> roll3= roll.stream().takeWhile(s->!s.equals("114040")).collect(Collectors.toList());
        roll.set(1,null);
        //p(roll);
        /**
         * Of nullable count total null object
         * */
        Object o = new Object();
        Long count=  Stream.ofNullable(o).count();

        p(count);
    }
}
