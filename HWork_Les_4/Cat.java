package HWork_Les_4;

public class Cat<T, S> extends Human{

    protected T run;
	protected S sleep;
	
	Cat(Integer id, String name, String gender, Integer age, T run, S sleep){
		super(id, name, gender, age);
        this.run = run;
		this.sleep = sleep;
	}
	
    public T getRun() { return run; }
	public S getSleep() { return sleep; }
	
    public static void add(Cat<String, String> alf) {
    }

    public String getInfo() {
        return String.format("ID: %s, Name: %s, Gender: %s,  Age: %d,  Run: %s, Sleep: %s.", 
        super.getId(), super.getName(), super.getGender(), super.getAge(), this.run, this.sleep, this.getClass().getSimpleName());
    }
}    

