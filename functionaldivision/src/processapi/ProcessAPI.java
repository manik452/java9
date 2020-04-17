package processapi;

import com.functionaldivision.MainClass;
import com.printmedia.HelloWorld;

import java.io.IOException;

public class ProcessAPI {
    public static void p(Object o){
        System.out.println(o);
    }

    public static void main(String[] arg) throws IOException {
        p("Hello world");
        ProcessBuilder processBuilder = new ProcessBuilder("notepad.exe");
        String notPresent="Not Present";
        Process process = processBuilder.start();
        ProcessHandle.Info info = process.info();
        p(process.pid());
        p(info.command().orElse(notPresent));
    }
}
