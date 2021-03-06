public class SimpleDotComTestDrive {

    public static void main(String[] args) {

        // Создаём экземпляр класса SimpleDotCom
        SimpleDotCom dot = new SimpleDotCom();

        // Создаём массив для местоположения "сайта" (три последовательных числа из семи)
        int[] locations = {2, 3, 4};

        // Вызываем сеттер "сайта"
        dot.setLocationCells(locations);

        // Делаем ход от имени пользователя
        String userGuess = "2";

        //Вызываем метод checkYourself() объекта SimpleDotCom
        String result = dot.checkYourself(userGuess);

        //
        String testResult = "Неудача";

        if (result.equals("Попал")) {
            testResult = "Пройден"; // Если ход (2) возвращает строку "Попал", значит всё работает.
        }
        //Печатаем резщультат теста
        System.out.println(testResult);

    }
}
