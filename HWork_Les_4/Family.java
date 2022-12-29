package HWork_Les_4;

public class Family extends Human{

    protected String socialStatus;
    protected String memberFamily;
    protected String groupFamily;
   
    public Family(Integer id, String name, String gender, Integer age, String socialStatus, String groupFamily, String memberFamily){
        super(id, name, gender, age);
        this.socialStatus = socialStatus;
        this.groupFamily = groupFamily;
        this.memberFamily = memberFamily;
    }

    public String getSocialStatus(){
        return socialStatus;
    }
    public String getGroupFamily(){
        return groupFamily;
    }
    public String getMemberFamily(){
        return memberFamily;
    }
    
    public void setSocialStatus(String socialStatus){
        this.socialStatus = socialStatus; 
    }
    public void setGroupFamily(String groupFamily){
        this.groupFamily = groupFamily; 
    }
    public void setMemberFamily(String memberFamily){
        this.memberFamily = memberFamily; 
    }
  
    public String getInfo() {
        return String.format("ID: %s, Name: %s, Gender: %s,  Age: %d,  Social status: %s, Group Family: %s, Member family: %s.", 
        super.getId(), super.getName(), super.getGender(), super.getAge(), this.socialStatus, this.groupFamily, this.memberFamily, this.getClass().getSimpleName());
    }
}
