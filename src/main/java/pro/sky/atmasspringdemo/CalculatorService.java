package pro.sky.atmasspringdemo;


import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

@Service
public class CalculatorService {
    public String hello () {
        return "Добро пожаловать в калькулятор.";
    } ///Приветствие;


    public int answerCalcutatorPlus(int number1, int number2) {
        return number1 + number2;
    } ///Сумма;

    public int answerCalcutatorMinus(int number1, int number2) {
        return number1 - number2;
    }///Разность;

    public int answerCalcutatorMultiply(int number1, int number2) {
        return number1 * number2;


    }///Умножение:

    public float answerCalcutatorDivide(float number1,float number2) {
        return number1 / number2;
    }///Деление;
}

