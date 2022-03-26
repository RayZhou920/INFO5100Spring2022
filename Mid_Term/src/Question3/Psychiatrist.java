package Question3;

public class Psychiatrist {
    public Psychiatrist() {
    }

    // asks moody object about its mood
    public void examine(Moody moody) {
        System.out.println("How are you feeling today?");
        System.out.println(moody.getMood());
        moody.expressFeelings();
    }

    // /a moodyObject is observed to either laugh or cry
    public void observe(Moody moody) {
        System.out.println("Observation: " + moody.toString());
    }

    // Write a main method to output the result
    public static void main(String[] args) {
        Psychiatrist psychiatrist1 = new Psychiatrist();
        Moody happy = new Happy();
        Moody sad = new Sad();
        psychiatrist1.examine(happy);
        psychiatrist1.observe(happy);
        psychiatrist1.examine(sad);
        psychiatrist1.observe(sad);
    }

}
