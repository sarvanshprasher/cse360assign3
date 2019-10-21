import java.util.*;
/**
 * Zhengjun Li
 * Class ID: 70641
 * CSE 360 - Callis - Monday
 * 1216057583
 * Assignment3:
 * Calculator class that inherits from AddingMachine class, has two additional operations
 */

/** Represents a calculator
 * @version 1.1 second commit
 */
public class Calculator extends AddingMachine {

    public Calculator()
    {
        super(); //invokes constructor of base class, AddingMachine
    }

    /**takes number and multiplies total and sets to total
     * @param number to multiply
     */
    public void mult(int number)
    {
        this.total = this.total * number;
        this.history = this.history + " * " + number;
    }
    /**takes number and divides total and sets to total
     * @param number to divide
     */
    public void div(int number)
    {
        //conditions if divide by zero or not
        if(number!=0)
        {
            this.total = this.total / number;
            this.history = this.history + " / " + number;
        }
        else
        {
            this.total = 0;
        }
    }

    /**takes number and raises total to that number
     * @param number be raised to the power of
     */
    public void power(int number) {
        int i;
        int answer = this.total;
        if (number > 0) {
            for (i = 0; i < number - 1; i++) {
                this.total = this.total * answer;
            }
            this.history = this.history + " " + answer + "^" + number;
        }
        if (number == 0)
            this.total = 1;
        if (number < 0)
        {
            this.total = 0;
        }
    }
}



