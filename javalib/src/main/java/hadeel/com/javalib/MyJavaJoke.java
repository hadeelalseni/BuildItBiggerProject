package hadeel.com.javalib;

import java.util.Random;

public class MyJavaJoke {

    private String [] jokes = {
            "Q. Why is Peter Pan flying all the time?\n" +
                    "\n" +
                    "A. He Neverlands!",
            "Q. Why is Cinderella so bad at soccer?\n" +
                    "\n" +
                    "A. Because she always runs away from the ball!",
            "The question isn’t at what age I want to retire, it’s at what income.",
            "Q. What does a cat have that no other animal has?\n" +
                    "\n" +
                    "A. Kittens.",
            "Q: Why don’t cats like online shopping?\n" +
                    "\n" +
                    "A: They prefer a cat-alogue.",
    };

    public String getJoke(){
        Random random = new Random();
        return jokes[random.nextInt(jokes.length)];
    }
}
