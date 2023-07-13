package de.telran.lesson17.practice;

public class TestArrObj {
    public static void main(String[] args) {
// --- Работа со строками
        String[] arrStr = new String[3];
        arrStr[0] = "Строка1";
        arrStr[2] = "Строка3";
        System.out.println(" --- arrStr ---");
        for (String val : arrStr) System.out.println(val);

        String[] arrStrLiteral = {"Стр1", "Стр2", "Стр3"};
        System.out.println(" --- arrStrLiteral ---");
        for (String val : arrStrLiteral) System.out.println(val);

        // --- Работа с нашими объектами Pen

        Pen[] pens = new Pen[3];
        pens[0] = new Pen();
        pens[0].setColor("синяя");

        pens[1] = new Pen("красная");

        // 3й элемент
        Pen pen = new Pen("черный");
        pens[2] = pen;

        System.out.println(" --- pens ---");
        for (Pen val : pens) System.out.println(val);
        System.out.println(pens[0].getColor());
        System.out.println(pens[1].getColor());
        System.out.println(pens[2].getColor());
        //вывод информации о цветах через for
        for (Pen val : pens) System.out.println(val.getColor());

        /// Создаем новый массив с помощью литерала
        Pen[] pensLiteral = { new Pen("желтый"),
                              new Pen("зеленый")};
        System.out.println(" --- pensLiteral ----");
        for (Pen val : pensLiteral) System.out.println(val.getColor());

        System.out.println(pensLiteral); //выполняется toString()

        // Ошибка, выход ха пределы массива
//        System.out.println(pensLiteral[3]); //не существует 4 элемента

    }
}
