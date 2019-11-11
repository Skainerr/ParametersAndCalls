package Tasks.Task5;

import Numbers.Digit;
import Tasks.Task1.Numbers;
import Tasks.Task4.AdvancedOperations;

/**
 * This class specify amount of units (ones, tens, hundreds, thousands) that will be new number created with
 *
 * Enables additional usage (additional creation) when returning NumberUnit
 */
public class NumberAmount {
    AdvancedOperations operations;


    public NumberAmount(AdvancedOperations operations){
        this.operations = operations;
    }

    /**
     * Specify amount of unit as one
     * @return NumberUnit to specify what would be of this amount
     */
    public NumberUnit one(){
        NumberUnit numberUnitOne = new NumberUnit(new Numbers().one(), operations);
        return numberUnitOne;
    }

    /**
     * Specify amount of unit as two
     * @return NumberUnit to specify what would be of this amount
     */
    public NumberUnit two(){
        NumberUnit numberUnitTwo = new NumberUnit(new Numbers().two(), operations);
        return numberUnitTwo;
    }

    /**
     * Specify amount of unit as three
     * @return NumberUnit to specify what would be of this amount
     */
    public NumberUnit three(){
        NumberUnit numberUnitThree = new NumberUnit(new Numbers().three(), operations);
        return numberUnitThree;
    }

    /**
     * Specify amount of unit as four
     * @return NumberUnit to specify what would be of this amount
     */
    public NumberUnit four(){
        NumberUnit numberUnitFour = new NumberUnit(new Numbers().four(), operations);
        return numberUnitFour;
    }

    /**
     * Specify amount of unit as five
     * @return NumberUnit to specify what would be of this amount
     */
    public NumberUnit five(){
        NumberUnit numberUnitFive = new NumberUnit(new Numbers().five(), operations);
        return numberUnitFive;
    }

    /**
     * Specify amount of unit as six
     * @return NumberUnit to specify what would be of this amount
     */
    public NumberUnit six(){
        NumberUnit numberUnitSix = new NumberUnit(new Numbers().six(), operations);
        return numberUnitSix;
    }

    /**
     * Specify amount of unit as seven
     * @return NumberUnit to specify what would be of this amount
     */
    public NumberUnit seven(){
        NumberUnit numberUnitSeven = new NumberUnit(new Numbers().seven(), operations);
        return numberUnitSeven;
    }

    /**
     * Specify amount of unit as eight
     * @return NumberUnit to specify what would be of this amount
     */
    public NumberUnit eight(){
        NumberUnit numberUnitEight = new NumberUnit(new Numbers().eight(), operations);
        return numberUnitEight;
    }

    /**
     * Specify amount of unit as nine
     * @return NumberUnit to specify what would be of this amount
     */
    public NumberUnit nine(){
        NumberUnit numberUnitNine = new NumberUnit(new Numbers().nine(), operations);
        return numberUnitNine;
    }

    /**
     * Gets digit from creation process and returns it
     * @return created digit
     */
    public Digit getDigit(){
        return operations.getResult();
    }
}
