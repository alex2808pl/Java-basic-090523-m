package de.telran.lesson16;

public class TestInnerClass {
    public static void main(String[] args) {
        Zoo zoo1 = new Zoo();
        zoo1.open();

        Zoo.Monkey monkey = zoo1.new Monkey();
        monkey.runFood();

        Zoo.Monkey.Banane banane = monkey.new Banane(); //new Zoo().new Monkey().new Banane(); //zoo1.new Monkey().new Banane();
        banane.getInfo();

    }
}

class Zoo {
    int count = 10; //количество животный
    private  String phone = "32446356747";
    void open() {
        System.out.println("Открыт с 9 до 18 -> Смотрите обезьянку " + (new Monkey()).name);

    }

    class Monkey { //Вложенный внутренний класс
        String name = "Муся";
        void runFood() {
            System.out.println("Обезьяна есть и улыбается одна из количества животных " + count + " звоните по тел. "+phone);

            class Tail { //Локальные внутренние классы метода
                int length = 4;
                String runHelp() {
                    return (length>3) ? " держит хвостом пищу " : " махает хвостом ";
                 }
            }

            System.out.println((new Tail()).runHelp());
        }

        void runSmile() {
            System.out.println("Smile :)");
            // new Tail()).runHelp() - не можем использовать в другом методе того же класса
        }

        class Banane { // Вложенный внутренний класс
            String sort = "Yellow";

            String getSort() {
                return sort;
            }

            void getInfo() {
                System.out.println(sort +" есть обезьяна по имени "+ name + " из количество животных - "+count);
            }

        }
    }
}
