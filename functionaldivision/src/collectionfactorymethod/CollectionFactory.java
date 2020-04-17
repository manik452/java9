package collectionfactorymethod;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectionFactory {
    public static void p(Object o){
        System.out.println(o);
    }

    public static void main(String[] arg){
        /**
         * Arrays.aslist() and List.of() are non changable list. when it create
         * we never change list value or update value
         * We can also make a normal list into non changeable list to use collections.unmodifiableList
         * */
        List<String> list = Collections.unmodifiableList(Arrays.asList("abc","def"));
        List<String> modifiableList =Arrays.asList("abc","def");
        List<String> streamCollectionList =Stream.of("Java","Python").collect(Collectors.toList());
//        modifiableList.add("man");
        streamCollectionList.add("man");
        List<String> notModifiable = Collections.unmodifiableList(streamCollectionList);
//        notModifiable.add("df");
        p("Hello world");
        p(list);

        /**
         * Map Check
         * Map.of()
         * Map.ofEntries(Map.entry())
         * */
        Map<Integer, String> map = Map.of(1,"Java",2,"Grovy");
        Map<Integer, String> map2 = Map.ofEntries(Map.entry(1,"C"), Map.entry(2,"C++"));
        p(map);
        p(map2);

    }
}
