//Exercise Theme 3

//!First Part:
//*Create a Function with three numbers, sum between.
//*Call the function on the main y give values.

//!Second Part:
//*Create a car class.
//*Inside the car class, create a numeric variable storing the number of doors.
//*Create a function whos increase the number the car doors.
//*Create an object myCar on the main and add a door.
//*Show the number of doors storend in the object.

public class Exercise_Theme_3{
    public static void main(String[] args){
        System.out.println(sum_num(2, 4, 6)); //? The result need to be 12

        Car myCar = new Car();  //? 5 Car doors
        myCar.doors_increase(); //? Increase +1
        myCar.doors_increase(); //? Increase +1
        myCar.doors_increase(); //? Increase +1
        System.out.println(myCar.doors_num); //? The result need to be 8
    }
    
    public static int sum_num(int a, int b, int c){ //? Function Sum
        int sum = a + b + c; //? Sum the numbers
        return sum;         
    }
}

class Car{
    public int doors_num = 5; //? Number of doors

    public void doors_increase(){  //? Function increase 
        this.doors_num++; 
    }
}