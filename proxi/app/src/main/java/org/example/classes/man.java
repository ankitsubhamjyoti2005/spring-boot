package org.example.classes;

public class man implements person{
    private String name;
    private String age;
    private String city;
    private String country;

    //constrer
    public man(String name, String age,String city,String country){
        this.age =age;
        this.city = city;
        this.name = name;
        this.country = country;
    }
    @Override
    public void introduction(String name) {
        System.out.println("my name is :- "+  this.name);
    }

    @Override
    public void sayAge(String age) {
        System.out.println("the age is:-"+ this.age);
    }

    @Override
    public void sayFrom(String city, String country) {
        System.out.println("the city is: "+this.city +" the country is :-" + this.country);
    }

    public String getName() {
        return this.name;
    }
}
