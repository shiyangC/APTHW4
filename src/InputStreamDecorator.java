import java.io.IOException;
import java.io.InputStream;

public abstract class InputStreamDecorator extends InputStream {
    protected InputStream in;

    public InputStreamDecorator(InputStream in) {
        this.in = in;
    }

    public int read() throws IOException {
        return in.read();
    }

    public int read(byte[] b, int offset, int len) throws IOException {
        return in.read(b, offset, len);
    }
}
