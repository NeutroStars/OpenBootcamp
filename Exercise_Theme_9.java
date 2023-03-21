//Exercise Theme 9

//!Create a Person class with the following variables:
//*Age
//*Name
//*The phone

//*Once the class is created, create a new Customer class that inherits from Person, 
    //*this new class will have the credit variable only for that class.
//*Now create an object of the Customer class that should have age, phone, 
    //*name and credit as properties, you have to give them value and display them on the screen.
//*Once this is done, do the same with the Worker class that inherits from Person, 
    //*and with a salary variable that only the Worker class has.

public class Exercise_Theme_9{
    public static void main(String[] args){
        
        Customer customer = new Customer();
        customer.setCredit(800);
        customer.setAge(20);
        customer.setName("Damian Wayne");
        customer.setPhone("9876543210");

        System.out.println("Name: " + customer.getName());
        System.out.println("Age: " + customer.getAge());
        System.out.println("Phone: " + customer.getPhone());
        System.out.println("Credit Amount: " + customer.getCredit() + "\n");

        Worker worker = new Worker();
        worker.setSalary(1800.5);
        worker.setAge(14);
        worker.setName("Arthur");
        worker.setPhone("0123456789");

        System.out.println("Name: " + worker.getName());
        System.out.println("Age: " + worker.getAge());
        System.out.println("Phone: " + worker.getPhone());
        System.out.println("Week Salary: " + worker.getSalary());
    }
}

class Person{
    int age;
    String name;
    String phone;

    public void setAge(int age){
        this.age = age;
    }
    public int getAge(){
        return this.age;
    }

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }

    public void setPhone(String phone){
        this.phone = phone;
    }
    public String getPhone(){
        return this.phone;
    } 
}

class Customer extends Person{
    int credit;

    public void setCredit(int credit){
        this.credit = credit;
    }
    public int getCredit(){
        return this.credit;
    }   
}

class Worker extends Person{
    double salary;

    public void setSalary(double salary){
        this.salary = salary;
    }
    public double getSalary(){
        return this.salary;
    }
}