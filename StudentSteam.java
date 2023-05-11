import java.util.*;
// Создание класса StudentSteam и подключение к интерфейсам Iterable<StudentGroup>
public class StudentSteam implements Iterable<StudentGroup>{
    private List<StudentGroup> steam;
// Конструктор класса StudentSteam
    public StudentSteam(List<StudentGroup> steam) {
        this.steam = steam;
    }
// Метод для вызова списка экземпляра
    public List<StudentGroup> getSteam() {
        return steam;
    }
// Метод, который устанавливает список экземпляра
    public void setSteam(List<StudentGroup> steam) {
        this.steam = steam;
    }
// Метод, который переустанавливает метод итерации Iterator<StudentGroup> для класса StudentGroup
    @Override
    public Iterator<StudentGroup> iterator() {
        return new Iterator<StudentGroup>(){
            private int index = 0;
            @Override
            public boolean hasNext() {
               return index<steam.size();
            }
            @Override
            public StudentGroup next() {
                if(!hasNext())
                {
                    return null;
                }
                return steam.get(index++);        
            }

        };
    }


}