//Exercise Theme 8

//!To practice encapsulation:

//*Create Person class.
//*Create the private variables age, name and phone of the Person class.
//*Create gets and sets of each property.
//*Create a person object in main.
//*Use the gets and sets to give values to the age, name and phone properties, finally show them on the console.

public class Exercise_Theme_8 {
    public static void main(String[] args){
        Person age = new Person();
        age.setTypeage(20);
        System.out.println(age.getType());

        Person name = new Person();
        name.setTypename("Damian");
        System.out.println(name.getTypename());

        Person phone = new Person();
        phone.setTypephone("932-762-3012");
        System.out.println(phone.getTypephone());
        

    }

}

class Person{
    private int age;
    private String name;
    private String phone;

    public void setTypeage(int age){
        this.age = age;
    }
    public int getType(){
        return this.age;
    }

    public void setTypename(String name){
        this.name = name;
    }
    public String getTypename(){
        return this.name;
    }

    public void setTypephone(String phone){
        this.phone = phone;
    }
    public String getTypephone(){
        return this.phone;
    }
}