/* Создайте класс Счетчик, у которого есть метод add(), увеличивающий значение внутренней int переменной на 1. 
Сделайте так, чтобы с объектом такого типа можно было работать в блоке try-with-resources. 
Подумайте, что должно происходить при закрытии этого ресурса? Напишите метод для проверки, закрыт ли ресурс. 
При попытке вызвать add() у закрытого ресурса, должен выброситься IOException */

public class sem3excep1 {
    class Counter implements AutoCloseable {

        boolean on;
        int counter;
    
        public Counter() {
            on = true;
            counter = 0;
        }
    
        public void add (int step) {
            counter+=step;
            if (step <= 0) throw new RuntimeException("step меньше 1");
        }
    
    
        @Override
        public void close() throws Exception {
            if(on) {
                on = false;
                counter = 0;
            }
        }
    }
}
