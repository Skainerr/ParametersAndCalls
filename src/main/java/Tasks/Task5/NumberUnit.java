package Tasks.Task5;

import Numbers.Digit;
import Tasks.Task1.Numbers;
import Tasks.Task3.ExtendedNumbers;
import Tasks.Task2.ExtendedOperations;
import Tasks.Task4.AdvancedOperations;

/**
 * Class that add specific value into AdvancedOperation (based on unitValue)
 * Enables additional usage (additional creation) by returning NumberAmount
 */
public class NumberUnit {
    Digit unitValue;
    AdvancedOperations operations;

    public NumberUnit(Digit unitValue, AdvancedOperations operations){
        this.unitValue = unitValue;
        this.operations = operations;
    }

    /**
     * Add to numberAmount digit of unitValue
     * @return NumberAmount
     */
    public NumberAmount ones(){
        return new NumberAmount(operations.plus(unitValue));
    }

    /**
     * Add to numberVolume digit of unitValue * 10
     * @return NumberVolume
     */
    public NumberAmount tens(){
        return new NumberAmount(operations.plus(ExtendedOperations.multiply(unitValue, new ExtendedNumbers().ten())));
    }

    /**
     * Add to numberVolume digit of unitValue * 100
     * @return NumberVolume
     */
    public NumberAmount hundreds(){
        return new NumberAmount(operations.plus(ExtendedOperations.multiply(unitValue, new ExtendedNumbers().hundred())));

    }

    /**
     * Add to numberVolume digit of unitValue * 100
     * @return NumberVolume
     */
    public NumberAmount thousands(){
        return new NumberAmount(operations.plus(ExtendedOperations.multiply(unitValue, new ExtendedNumbers().thousand())));
    }

}
