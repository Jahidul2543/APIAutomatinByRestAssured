import java.util.Base64;

public class Sample {
    public static void main(String[] args) throws Exception{
        String encoding = Base64.getEncoder().encodeToString(("test1:test1").getBytes("UTF-8"));
        System.out.println(encoding);

    }
}
