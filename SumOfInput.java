/**
 * Write a description of class SumOfInput here.
 *
 * @author (Keivn HW)
 * @version (feb 5)
 */
public class SumOfInput
{
    // instance variables - replace the example below with your own
    private Integer sum;


    /**
     * Constructor for objects of class SumOfInput
     */
    public SumOfInput()
    {
        // initialise instance variables
        sum = 0;
        
    }
    
    public Integer oneToNumber(Integer numberToSum){
        sum = 0; //Need to reset the test otherwise test 2 fails :D
        for (Integer i = 0; i<= numberToSum; i++){
        sum += i;
        }
        return sum;
    }

}
