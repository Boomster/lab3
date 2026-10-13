import java.util.Random;

public class Cuckoo extends Bird{
    public void sing(){
        int k = (new Random()).nextInt(10) + 1;
        for (int i = 0; i < k; i++) {
            System.out.println("ку-ку");
        }
    }

    public Cuckoo(){}
}
