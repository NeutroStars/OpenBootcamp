//Exercise Theme 4

//*Using an If, create a condition whos compare if the var numberIf it's positive, negative or 0.
//*Clue: The numbers < 0 are negative and the > 0 are positives.

//*Create While, need to have acondition numberWhile < 3, the code need to:.
    //* Increase the value of the var 1+ every execution time.
    //* Show on terminal on every execution.

//*Create a Do While, you need to create the same While structure, but need to execute just one time.

//*Create a For, create a var numberFor, this have the value 0 and the condition var <= 3, this increase on
    //*her own value on every execution, show on terminal.

//*Create a Switch, create a var station, and differents cases for the four year stations. Depends the var
    //*value station, needs to show the name of the station on the terminal. Add default when the value
    //* of  */

public class Exercise_Theme_4 {
    public static void main(String[] args){
        //!If
        int numberIf = 0;
        if(numberIf > 0){
            System.out.println("Positive:" + numberIf);
        } else if(numberIf < 0){
            System.out.println("Negative:" + numberIf);
        } else {
            System.out.println("Zero 0");
        }
        //!while
        int numberWhile = 0;
        while(numberWhile < 3){
            numberWhile++;
            System.out.println("while result: " + numberWhile);
        }
        //!do while
        do{
            System.out.println("dowhile result: " + numberWhile);
            numberWhile++;
        } while(numberWhile < 3);
        //!for
        for (int numberFor = 0; numberFor <= 3; numberFor++){
            System.out.println("for result: " + numberFor);
        }
        //!switch
        int station = 0;
        switch(station){
            case 1:
                System.out.println("Winter");
                break;
            case 2:
                System.out.println("Spring");
                break;
            case 3:
                System.out.println("Summer");
                break;
            case 4:
                System.out.println("Fall");
                break;
            default:
                System.out.println("Invalid data to check the station");
        }


    }

}
