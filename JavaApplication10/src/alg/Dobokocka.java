

package alg;

import java.util.Random;


public class Dobokocka {
    private Random generator;

    public Dobokocka() {
        generator = new Random();
    }
    
    public int dobas(){
        return (generator.nextInt(6)+1);
    }
    
    
}
