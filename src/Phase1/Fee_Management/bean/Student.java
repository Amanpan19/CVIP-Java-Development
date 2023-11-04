package Phase1.Fee_Management.bean;

public class Student {
    private int studentId;
    private String stuName;
    private String grade;
    private int totalFee;
    private int feeSubmitted;
    private int feeDue;

    public Student(){

    }
    public Student(int studentId, String stuName, String grade, int totalFee, int feeSubmitted, int feeDue) {
        this.studentId = studentId;
        this.stuName = stuName;
        this.grade = grade;
        this.totalFee = totalFee;
        this.feeSubmitted = feeSubmitted;
        this.feeDue=feeDue;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public int getTotalFee() {
        return totalFee;
    }

    public void setTotalFee(int totalFee) {
        this.totalFee = totalFee;
    }

    public int getFeeSubmitted() {
        return feeSubmitted;
    }

    public void setFeeSubmitted(int feeSubmitted) {
        this.feeSubmitted = feeSubmitted;
    }

    public int getFeeDue(){
        return feeDue;
    }

    public void setFeeDue(int feeDue){
        this.feeDue = feeDue;
    }

    @Override
    public String toString() {
        return "FeeManagement{" +
                "studentId=" + studentId +
                ", stuName='" + stuName + '\'' +
                ", grade=" + grade +
                ", totalFee=" + totalFee +
                ", feeSubmitted=" + feeSubmitted +
                '}';
    }
}
