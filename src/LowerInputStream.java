import java.io.IOException;
import java.io.InputStream;

public class LowerInputStream extends InputStreamDecorator {

    public LowerInputStream(InputStream in) {
        super(in);
    }

    @Override
    public int read() throws IOException {
        int c = in.read();
        if (c >= 'A' && c  <= 'Z')
            return c + 32;
        return c;
    }

    @Override
    public int read(byte[] b, int offset, int len) throws IOException {
        int c =  in.read(b, offset, len);
        if (c >= 'A' && c  <= 'Z')
            return c + 32;
        return c;
    }

}
