import java.util.Random;




class code {
    public void generateNumbers() {
        Random rand = new Random();
        for (int i = 0; i < 5; i++) {
            int randomNum = rand.nextInt(100) + 1; 
            System.out.println(randomNum);
        }
    }
}

public class RandomGenerator{
    public static void main(String[] args) {
        code obj = new code();
        obj.generateNumbers();
    }
}
