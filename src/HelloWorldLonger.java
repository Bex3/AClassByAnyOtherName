/**
 * Created by bearden-tellez on 8/29/16.
 */
public class HelloWorldLonger {
    public static void main(String[] args) {
        EnglishGreeting myEnglishGreeting = new EnglishGreeting();
        FrenchGreeting myFrenchGreeting = new FrenchGreeting();
        SpanishGreeting mySpanishGreeting = new SpanishGreeting();

        myEnglishGreeting.greet();
        myFrenchGreeting.greetSomeone("Fred");
        mySpanishGreeting.greet();

    }


}
