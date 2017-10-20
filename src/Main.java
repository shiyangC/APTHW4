import java.io.ByteArrayInputStream;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        String input = "I know the Decorator Pattern therefore I RULE!";
        ByteArrayInputStream bis = new ByteArrayInputStream(input.getBytes());

        LowerInputStream lis = new LowerInputStream(bis);

        int c = 0;
        while((c = lis.read()) >= 0) {
            System.out.print((char)c);
        }
    }
}
