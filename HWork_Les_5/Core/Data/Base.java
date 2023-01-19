package HWork_Les_5.Core.Data;

public class Base {

    protected Integer id; //** Идентификационный номер сотрудника */ 
    protected String nameWorker; //** Имя сотрудника */ 
    protected String surnameWorker; //** Фамилия сотрудника */ 
    protected String patronymicWorker; //** Отчество сотрудника */ 
    protected String dateBirthWorker; //** Дата рождения сотрудника */ 
    protected String positionWorker; //** Должность сотрудника */ 
    protected String subdivision; //** Подразделение */ 
    protected Integer salary; //** Размер зарплаты сотрудника */ 
    protected String workPhoneNumber; //** Рабочий номер телефона сотрудника */ 
    protected String personalPhoneNumber; //** Личный номер телефона сотрудника */ 
    protected String adressWorker; //** Адрес проживания сотрудника */ 
    protected String typeContract; //** Вид заключенного с работником договора */ 


    public Base(Integer id, String nameWorker, String surnameWorker, String patronymicWorker, String dateBirthWorker, String positionWorker, 
    String subdivision, Integer salary, String workPhoneNumber, String personalPhoneNumber, String adressWorker, String typeContract){
        this.id = id;
        this.nameWorker = nameWorker;
        this.surnameWorker = surnameWorker;
        this.patronymicWorker = patronymicWorker;
        this.dateBirthWorker = dateBirthWorker;
        this.positionWorker = positionWorker;
        this.subdivision = subdivision;
        this.salary = salary;
        this.workPhoneNumber = workPhoneNumber;
        this.personalPhoneNumber = personalPhoneNumber;
        this.adressWorker = adressWorker;
        this.typeContract = typeContract;
    }

    ///++++///
    public Integer getId(){
        return id;
    }
    public String getNameWorker(){
        return nameWorker;
    }
    public String getSurnameWorker(){
        return surnameWorker;
    }
    public String getPatronymicWorker(){
        return patronymicWorker;
    }
    public String getDateBirthWorker(){
        return dateBirthWorker;
    }
    public String getPositionWorker(){
        return positionWorker;
    }
    public String getSubdivision(){
        return subdivision;
    }
    public Integer getSalary(){
        return salary;
    }
    public String getWorkPhoneNumber(){
        return workPhoneNumber;
    }
    public String getPersonalPhoneNumber(){
        return personalPhoneNumber;
    }
    public String getAdressWorker(){
        return adressWorker;
    }
    public String getTypeContract(){
        return typeContract;
    }
    
    ///++++///
    public void setId(Integer id){
        this.id = id;
    }
    public void setNameWorker(String nameWorker){
        this.nameWorker = nameWorker;
    }
    public void setSurnameWorker(String surnameWorker){
        this.surnameWorker = surnameWorker;
    }
    public void setPatronymicWorker(String patronymicWorker){
        this.patronymicWorker = patronymicWorker;
    }
    public void setDateBirthWorker(String dateBirthWorker){
        this.dateBirthWorker = dateBirthWorker;
    }    
    public void setPositionWorker(String positionWorker){
        this.positionWorker = positionWorker;
    }  
    public void setSubdivision(String subdivision){
        this.subdivision = subdivision;
    }
    public void setSalary(Integer salary){
        this.salary = salary;
    }
    public void setWorkPhoneNumber(String workPhoneNumber){
        this.workPhoneNumber = workPhoneNumber;
    }
    public void setPersonalPhoneNumber(String personalPhoneNumber){
        this.personalPhoneNumber = personalPhoneNumber;
    }    
    public void setAdressWorker(String adressWorker){
        this.adressWorker = adressWorker;
    }    
    public void setTypeContract(String typeContract){
        this.typeContract = typeContract;
    }    
 
    ///++++///
    public String getInfo() {
        return String.format("ID сотрудника: %s, Имя: %s, Фамилия: %s, Отчество: %s, Дата рождения: %s, Должность: %s, Подразделение: %s, Зарплата: %d rub.,  ТелРаб: %s, ТелЛич: %s., Адресс проживания: %s., Вид договора: %s.", 
        this.id, this.nameWorker, this.surnameWorker, this.patronymicWorker, this.dateBirthWorker, 
        this.positionWorker, this.subdivision, this.salary, this.workPhoneNumber,  this.personalPhoneNumber, 
        this.adressWorker, this.typeContract, this.getClass().getSimpleName());
    }
}