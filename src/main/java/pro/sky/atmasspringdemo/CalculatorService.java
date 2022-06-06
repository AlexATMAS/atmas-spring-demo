package pro.sky.atmasspringdemo;


import org.springframework.stereotype.Service;

@Service
public class CalculatorService {
    public String hello () {
        return "Добро пожаловать в калькулятор.";
    } ///Приветствие;


    public String answerCalcutatorPlus(String number1, String number2) {
        if (number1.isEmpty() || number2.isEmpty()){
            return "ОШИБКА! Повторите ввод!";
        }else {
            int sum = Integer.parseInt(number1) + Integer.parseInt(number2);
            return number1 + "+" + number2 + "=" + sum;
        }
    } ///Сумма;

    public String answerCalcutatorMinus(String number1, String number2) {
        if (number1.isEmpty() || number2.isEmpty()){
            return "ОШИБКА! Повторите ввод!";
        }else {
            int diff = Integer.parseInt(number1) - Integer.parseInt(number2);
            return number1 + "-" + number2 + "=" + diff;
        }


    }///Разность;

    public String answerCalcutatorMultiply(String number1, String number2) {
        if (number1.isEmpty() || number2.isEmpty()){
            return "ОШИБКА! Повторите ввод!";
        }else {
            int multy = Integer.parseInt(number1)* Integer.parseInt(number2);
            return number1 + "*" + number2 + "=" + multy;
        }

    }///Умножение:

    public String answerCalcutatorDivide(String number1, String number2) {

        if (number1.isEmpty() || number2.isEmpty()){
            return "ОШИБКА! Повторите ввод!";
        }else if (number1.equals("0") || number2.equals("0")){
            return "ОШИБКА! На 0 делить нельзя!";
        }else {
            float divide =  Float.parseFloat(number1) / Float.parseFloat(number2);
            return number1 + "/" + number2 + "=" + divide;
        }
    }///Деление;
}
