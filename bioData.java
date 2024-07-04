class student {
    public String name;
    public int rollNo;
    public char grade;

    public void setName(String name) {
        this.name = name;
    }

    public void setRoll(int rollNo) {
        this.rollNo = rollNo;
    }

    public void setGrade(char grade){
        this.grade = grade;
    }

    public String getname() {
        return name;
    }

    public int getRollno() {
        return rollNo;
    }

    public char getgrade() {
        return grade;
    }

    public String toData() {
        return "Name : "+name+"\nRoll No : "+rollNo+"\nGrade : "+grade;
    }
}

public class bioData {
    public static void main(String[] args) {
        student st = new student();
        st.setName("Pihu");
        st.setRoll(87215110);
        st.setGrade('A');
        System.out.println(st.toData());
    }
}
