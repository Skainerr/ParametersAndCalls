package Tasks.Task3;

import Numbers.Digit;
import Operations.Operations;
import Tasks.Task1.Numbers;
import Tasks.Task2.ExtendedOperations;

public class ExtendedNumbers {

    public Digit one(){
        Digit one = Digit.Zero().next();
        return one;
    }

    public Digit ten(){
        Digit multipleOfOne = ExtendedOperations.doubleValue(ExtendedOperations.doubleValue(one()));
        multipleOfOne = ExtendedOperations.plusPlus(multipleOfOne);
        multipleOfOne = ExtendedOperations.doubleValue(multipleOfOne);
        Digit ten = multipleOfOne;
        return ten;
    }

    public Digit hundred(){
        Digit hundred = ExtendedOperations.multiply(ten(), ten());
        return hundred;
    }

    public Digit thousand(){
        Digit thousand = ExtendedOperations.multiply(hundred(), ten());
        return thousand;
    }
}
