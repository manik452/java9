package streamapi8;

import java.io.IOException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamAPI {
    public static void p(Object o) {
        System.out.println(o);
    }

    public static void main(String[] arg) throws IOException {
        List<String> list = Stream.of("java","Groovy","Kotlin").collect(Collectors.toList());
        list.add("ad");
        p(list);

        List<String> roll = new ArrayList<>();

        for(int i =1;i<=62;i++){
            roll.add("1140"+new DecimalFormat("00").format(i));
        }
        p(roll);
        /**
         * stream api
         * */
        roll.stream().forEach(s->System.out.println(s));
        roll.add("114052");
        p("count");
        roll.parallelStream().forEach(System.out::println);

        p(roll.parallelStream().distinct().count());
        p(roll.parallelStream().count());

    }
}
