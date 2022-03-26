package Question3;

// Abstact class: Moody
public abstract class Moody {
    abstract String getMood();
    abstract void expressFeelings();
    public void queryMood() {
        System.out.println("I feel Happy(or Sad) today!!");
    }
}