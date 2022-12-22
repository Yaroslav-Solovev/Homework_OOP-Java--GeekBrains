package HWork_Les_2;

abstract class Human {
    
    private Integer id;
    private String name;
    private String gender;
    private Integer age;
   
    public Human(Integer id, String name, String gender, Integer age){
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    public Integer getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public String getGender(){
        return gender;
    }
    public Integer getAge(){
        return age;
    }
    
    public void setId(Integer id){
        this.id = id; 
    }
    public void setName(String name){
        this.name = name; 
    }
    public void setGender(String gender){
        this.gender = gender; 
    }
    public void setAge(Integer age){
        this.age = age;
    }
  
    public abstract String getInfo();
}
