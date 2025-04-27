package spring.proxy.classes;

public class Man implements  Person {
    private String name;
    private String age;
    private String city;
    private String country;

    public Man( String name, String age , String city , String country ){
        this.name= name;
        this.age = age;
        this.country = country;
        this.city = city;
    }



    @Override
    public  void introduce( String name){
    System.out.println("My name is %s "+name);
    }
    @Override
    public void sayAge(String age) {
        System.out.println("My age is %s"+age);
    }
    @Override
    public void sayAddress(String city , String country){
        System.out.println("I live in %s which is in %s"+city + country);
    }
    public String getName() {
        return name;
    }

}
