import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Test {
    public static void main(String[] args) {
        Student student1 = new Student("Harry Potter",11,"London");
        Student student2 = new Student("Babayaga",58,"Dark Forest");
        Student student3 = new Student("Merlin",70,"Arthur Kingdom");
        Student student4 = new Student("Cao Biền",71,"Đại La");
        Map<Integer ,Student> studentMap = new HashMap<Integer,Student>();
        studentMap.put(1,student1);
        studentMap.put(2,student2);
        studentMap.put(3,student3);
        studentMap.put(4,student4);

        for (Map.Entry<Integer,Student> student: studentMap.entrySet() ){
            System.out.println( student.getKey()+" . "+student.getValue().display());
        }
        System.out.println("_____________Hashset_____________");
        Set<Student> students = new HashSet<Student>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        for (Student student:students){
            System.out.println(student.display());
        }

    }
}
