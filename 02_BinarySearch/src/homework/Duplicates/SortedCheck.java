package homework.Duplicates;

public class SortedCheck {
    //
    // НЕ СМОТРИТЕ В ЭТОТ ФАЙЛ=)
    // ЗАКРОЙТЕ ЭТОТ КОД!!
    //
    //
    // Нет, ну если очень хочется, то посмотрите...
    //
    // Там ниже реализована функция, которая проверяет
    // отсортирован ли массив или нет.
    //
    // Она понадобится для выполнения задания в RandomSort.java
    //
    // Самым лучшим вариантом будет
    // реализовать такую функцию самостоятельно,
    // и не подсматривать в то что находится там внизу
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    // Вы хотя бы попробуйте, у вас наверняка получится!
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    // Ок, вот:
    //
    public static boolean isSorted(int[] array) {

        for (int i = 1; i < array.length; i++) { // Идем по массиву начиная с индекса 1
            // В отсортированном массиве каждый следующий элемент должен быть больше либо равен предыдущему
            if (array[i] < array[i - 1]) { // если вдруг текущий элемент МЕНЬШЕ предыдущего, то массив не отсортирован
                return false;
            }
        }
        return true;
        // если цикл закончился, значит условие с return false ни разу не сработало, и можно возвращать true
    }

}
