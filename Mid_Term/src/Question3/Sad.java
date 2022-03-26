package Question3;

public class Sad extends Moody {
    public String getMood() {
        return "I feel sad.";
    }
    public void expressFeelings() {
        System.out.println("‘waah’ ‘boo hoo’ ‘weep’ ‘sob’");
    }
    @Override
    public String toString() {
        return "Subject cries a lot.";
    }
}