public class Cat{
    private String breed;
    private int age;
    private String name;
    
    public Cat(int age, String breed, String name){
        this.age=age;
        this.breed=breed;
        this.name=name;
    }
    public Cat(){
        this.age=3;
        this.breed="siberian";
        this.name="Gus";
    }
    public String getBreed(){
        return this.breed;
    }
    public void setBreed(String x){
        this.breed=x;
    }

    public int getAge(){
        return this.age;
    }
    public void setAge(int y){
        this.age=y;
    }
    public String getName(){
        return this.name;
    }
    public void setName(String z){
        this.name=z;
    }
   
    public String toString(){
        return "Name: " + this.name + " Age: " + this.age + " Breed: " + this.breed;
    }
}