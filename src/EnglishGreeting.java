/**
 * Created by bearden-tellez on 8/29/16.
 */
public class EnglishGreeting implements HelloWorldIn.HelloWorld {
        String name = "world";
        public void greet() {
            greetSomeone("world");
        }
        public void greetSomeone(String someone) {
            name = someone;
            System.out.println("Hello " + name);
        }
}


