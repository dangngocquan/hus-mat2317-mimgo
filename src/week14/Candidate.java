package week14;

public class Candidate {
    
    private String id;
    private String name;
    private String selection;
    private String sex;
    private int year;
    private int priority;
    
    public Candidate(String id, 
            String name, 
            String selection, 
            String sex, 
            int year, 
            int priority) {
        this.id = id;
        this.name = name;
        this.selection = selection;
        this.sex = sex;
        this.year = year;
        this.priority = priority;
    }
    
    public String id() {
        return this.id;
    }
    
    public String name() {
        return this.name;
    }
    
    public String selection() {
        return this.selection;
    }
    
    public String sex() {
        return this.sex;
    }
    
    public int year() {
        return this.year;
    }
    
    public int priority() {
        return this.priority;
    }
    
    public void setId(String id) {
        this.id = id;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public void setSelection(String selection) {
        this.selection = selection;
    }
    
    public void setSex(String sex) {
        this.sex = sex;
    }
    
    public void setYear(int year) {
        this.year = year;
    }
    
    public void setPriority(int priority) {
        this.priority = priority;
    }

    @Override
    public String toString() {
        return "Candidate[id=" + id + ",name=" + this.name + ",selection=" + this.selection + ",sex=" + this.sex + "year=" + this.year + "priority=" + this.priority;
    }
    
    public void print() {
        System.out.println(this.toString());
    } 
}
