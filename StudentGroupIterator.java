import java.util.Iterator;
import java.util.List;
// Создание класса StudentGroupIterator и подключение к интерфейсу Iterator<Student>
public class StudentGroupIterator implements Iterator<Student> {
    private int counter;
    private final List<Student> students;
// Конструктор класса StudentGroupIterator
    public StudentGroupIterator(List<Student> students) {
        this.students = students;
        this.counter = 0;
    }
// Метод, который вызывает boolean переменную, отражающую, есть ли следующий элемент в списке экземпляра 
    @Override
    public boolean hasNext() {
       return counter<students.size();

    }
// Метод, который вызывает следующий элемент списка экземпляра 
    @Override
    public Student next() {
        if(!hasNext())
        {
            return null;
        }
        //counter++;
        return students.get(counter++);        
    }
    
}