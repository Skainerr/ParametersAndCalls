package Tasks.Task5;

import Numbers.Digit;
import Tasks.Task4.AdvancedOperations;

/**
 * Starting point for number creation
 * Example: Digit 589 =  NumberCreator.create().five().hundreds().eight().tens().nine().ones().getDigit()
 */
public class NumberCreator {

    /**
     * Creates NumberAmount that can be used for number creation
     * @return new NumberAmount with zero
     */
    public static NumberAmount create(){
        NumberAmount NA = new NumberAmount(new AdvancedOperations(Digit.Zero()));
        return NA;
    }

}
