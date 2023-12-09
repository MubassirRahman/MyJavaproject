package Encapsulation;
public class Personinfo{
   private String Name;
   private int age;
   private String gender;
public Personinfo(String name, int age, String gender) {
    this.Name = name;
    this.age = age;
    this.gender = gender;
}
public void setName(String name) {
    this.Name = name;
}
public boolean setAge(int age) {
    if(age>=0&&age<100){
        this.age = age;
        return true;
    }
    return false;

}
public void setGender(String gender) {
    this.gender = gender;
}
@Override
public String toString() {
    return "Personinfo [Name=" + Name + ", age=" + age + ", gender=" + gender + "]";
}

   
}