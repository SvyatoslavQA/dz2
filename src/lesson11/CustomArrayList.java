package lesson11;


//представить что в java нет arraylist
//создать свой класс симулирующий работу класса динамической коллекции т.е. создать свою кастомную коллекцию
//в основе коллекции будет массив
//кастомняа коллекция должна хранить элементы разных классов быть generic
//предусмотреть операции добавления элемента удаления элемента получения элемента по индексу проверка есть ли элемент в коллекции создать метод очистки всей коллекции
//предусмотреть конструктор без параметров - создает массив размером по умолчанию
//предусмотреть конструктор с задаваемым размером внутреннего массива
//предусмотреть возможность автоматического расширения коллекции при добавлении элемента в том случае когда коллекция заполнена
//ФОРМАТИРОВАНИЕ

public class CustomArrayList<T> {
    private static final int DEFAULT_SIZE = 7;
    private Object[] array;
    private int size;

    public CustomArrayList() {
        this(DEFAULT_SIZE);
    } //Лучше делать this(defSize). Тогда у тебя не будет дублирования кода и если придется что-то менять, то в одном месте

    public CustomArrayList(int initialSize) {

        this.array = new Object[initialSize];
        this.size = 0;
    }

    public void add(T element) {
        checkSize();
        array[size++] = element;
    }


    public T get(int index) {
        if (index >= 0 && index < size) {
            return (T) array[index];
        }
        throw new IndexOutOfBoundsException("Index:" + index + ", Size:" + size); //нужно проверять что индекс больше нуля и меньше size
    }

    public boolean remove(T element) {
        for (int i = 0; i < size; i++) {
            if (element.equals(array[i])) {
                removeAtIndex(i);
                return true;
            }
        }
        return false;
    }

    public T removeAtIndex(int index) {
        // Проверяем, что индекс в пределах размера массива
        if (index >= 0 && index < size) {
            T removedElement = (T) array[index];
            for (int i = index; i < size - 1; i++) {
                array[i] = array[i + 1];
            }
            array[size - 1] = null;
            size--;
            return removedElement;
        }
        throw new IndexOutOfBoundsException("Index:" + index + ", Size:" + size);
    }

    public boolean contains(T element) {
        for (int i = 0; i < size; i++) {
            if (element.equals(array[i])) {
                return true;
            }
        }
        return false;
    }

    public void clear() {
        for (int i = 0; i < size; i++) {
            array[i] = null;
        }
        size = 0;
    }

    public int size() {
        return size;
    }

    private void checkSize() {
        if (size == array.length) {
            int newCapacity = array.length * 2;
            Object[] newArray = new Object[newCapacity];
            System.arraycopy(array, 0, newArray, 0, size);
            array = newArray;
        }
    }


    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < size; i++) {
            sb.append(array[i]);
            if (i < size - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    public static void main(String[] args) {
        CustomArrayList<Integer> list = new CustomArrayList<>();
        list.add(11);
        list.add(22);
        list.add(33);
        list.add(44);
        list.add(55);
        System.out.println("Inserted array:" + list);
        list.removeAtIndex(1);
        System.out.println("After removing element at index 1:" + list);
        System.out.println("Element at index 0:" + list.get(0));
        System.out.println("Contains number 33?" + list.contains(33));
        list.clear();
        System.out.println("After clearing:" + list);
    }
}