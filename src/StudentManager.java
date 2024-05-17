public class StudentManager {
    Student[] students;
    Grade[] grades;
    int num;
    int count;
    int x;
    int y;

    public StudentManager() {
        students = new Student[1];
        this.num = 0;
        this.count = 0;
        grades = new Grade[1];
        this.x = (students.length==1)?3:students.length;
        this.y = (grades.length==1)?3:grades.length;
    }

    public void PrintList(){
        for (int i = 0; i < students.length; i++) {
            System.out.println("student name: " + students[i].name + " , student age: " + students[i].age + " , student id: " + students[i].id);
        }
        System.out.println();
    }
//  Extra function!!!
    public void PrintGrades(){
        for (int i = 0; i < grades.length; i++) {
            System.out.println("student: "+grades[i].student.name+" , subject: "+grades[i].subject+" , grade: "+grades[i].grade);
        }
        System.out.println();
    }

    public void addStudent(Student student){
        if (num == students.length){
            Student[] newStudent = new Student[students.length * x];
            for (int i = 0; i < students.length; i++) {
                newStudent[i] = students[i];
            }
            students = newStudent;
        }
        students[num] = student;
        num++;
    }

    public void addGrade(Student student,String subject,double grader){
        Grade grade = new Grade(student,subject,grader);
        if (count == grades.length){
            Grade[] newGrade = new Grade[grades.length * y];
            for (int i = 0; i < grades.length; i++) {
                newGrade[i] = grades[i];
            }
            grades = newGrade;
        }
        grades[count] = grade;
        student.grades = grades;
        count++;
    }

    public double getAverageGrade(Student student){
        double sum = 0;
        int count1 = 0;
        for (int i = 0; i < grades.length; i++) {

                sum += student.grades[i].grade;
                count1++;

        }
        return sum/count1;
    }
}
