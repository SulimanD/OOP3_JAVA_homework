import java.util.Iterator;
import java.util.List;
// Создание класса StudentGroup и подключение к интерфейсам Iterable<Student>, Comparable<StudentGroup>
public class StudentGroup implements Iterable<Student>, Comparable<StudentGroup> {
    private List<Student> students;
// Конструктор класса StudentGroup
    public StudentGroup(List<Student> students) {
        this.students = students;
    }
// Метод для вызова списка экземпляра
    public List<Student> getStudents() {
        return students;
    }
// Метод, который устанавливает список экземпляра
    public void setStudents(List<Student> students) {
        this.students = students;
    }

    // @Override
    // public Iterator<Student> iterator() {
    //     return new StudentGroupIterator(students);
    // }


// Метод, который переустанавливает метод итерации Iterator<Student> для класса Student
    @Override
    public Iterator<Student> iterator() {
        return new Iterator<Student>(){
            private int index = 0;
            @Override
            public boolean hasNext() {
               return index<students.size();
            }
            @Override
            public Student next() {
                if(!hasNext())
                {
                    return null;
                }
                //counter++;
                return students.get(index++);        
            }

        };
    }
// Метод, который переустанавливает метод сортировки compareTo(StudentGroup o)
    @Override
    public int compareTo(StudentGroup o) {
            if(this.students.size()==o.students.size())
            {
                return 0;
            }
            if(this.students.size()<o.students.size())
            {
                return -1;
            }
            return 1;
         } 
    }