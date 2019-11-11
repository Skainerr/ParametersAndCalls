package Tasks.Task1;

import Numbers.Digit;

public class Numbers {

    public Digit zero(){
        return Digit.Zero();
    }
    /**
     * Creates number 1
     * @return Digit
     */
    public Digit one(){
        Digit one = zero().next();
        return one;
    }

    /**
     * Creates number 2
     * @return Digit
     */
    public Digit two(){
        Digit two = one().next();
        return two;
    }

    /**
     * Creates number 3
     * @return Digit
     */
    public Digit three(){
        Digit three = two().next();
        return three;
    }

    /**
     * Creates number 4
     * @return Digit
     */
    public Digit four(){
        Digit four = three().next();
        return four;
    }

    /**
     * Creates number 5
     * @return Digit
     */
    public Digit five(){
        Digit five = four().next();
        return five;
    }

    /**
     * Creates number 6
     * @return Digit
     */
    public Digit six(){
        Digit six = five().next();
        return six;
    }

    /**
     * Creates number 7
     * @return Digit
     */
    public Digit seven(){
        Digit seven = six().next();
        return seven;
    }

    /**
     * Creates number 8
     * @return Digit
     */
    public Digit eight(){
        Digit eight = seven().next();
        return eight;
    }

    /**
     * Creates number 9
     * @return Digit
     */
    public Digit nine(){
        Digit nine = eight().next();
        return nine;
    }
}
