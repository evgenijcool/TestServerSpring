package hello;

/**
 * Created by Evgeny on 08.12.2016.
 */
public class Greeter {

    private final long id;
    private final String content;

    public Greeter(long id, String content) {
        this.id = id;
        this.content = content;
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }
}
