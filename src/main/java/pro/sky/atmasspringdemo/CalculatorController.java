package pro.sky.atmasspringdemo;

import org.springframework.web.bind.annotation.*;

import java.util.Objects;


@RestController
@RequestMapping("/calculator")
public class CalculatorController {
    private final CalculatorService calculatorService;

    public CalculatorController(CalculatorService calculatorService){
        this.calculatorService = calculatorService;
    }


    @GetMapping
    public String hello () {
        return calculatorService.hello();
    }


    @GetMapping("/plus")
    public String answerCalcutatorPlus  (@RequestParam(value = "num1", required = false) Integer number1,
                                      @RequestParam(value = "num2",required = false) Integer number2) {
        if (Objects.isNull(number1) || Objects.isNull(number2)){
            return "Проверте введенные данные!";
        }else {
            return number1 + " + " + number2 + " = " + calculatorService.answerCalcutatorPlus(number1,number2);
        }
    }

    @GetMapping("/minus")
    public String answerCalcutatorMinus  (@RequestParam(value = "num1", required = false) Integer number1,
                                       @RequestParam(value = "num2",required = false) Integer number2) {

        if (Objects.isNull(number1) || Objects.isNull(number2)){
            return "Проверте введенные данные!";
        }else {
            return number1 + " - " + number2 + " = " + calculatorService.answerCalcutatorMinus(number1,number2);
        }
    }

    @GetMapping("/multiply")
    public String answerCalcutatorMultiply  (@RequestParam(value = "num1", required = false) Integer number1,
                                          @RequestParam(value = "num2",required = false) Integer number2) {
        if (Objects.isNull(number1) || Objects.isNull(number2)){
            return "Проверте введенные данные!";
        }else {
            return number1 + " * " + number2 + " = " + calculatorService.answerCalcutatorMultiply(number1,number2);
        }

    }

    @GetMapping("/divide")
    public String answerCalcutatorDivide  (@RequestParam(value = "num1", required = false) Float number1,
                                           @RequestParam(value = "num2",required = false) Float number2) {
        if (Objects.isNull(number1) || Objects.isNull(number2)){
            return "Проверте введенные данные!";
        }else if (number1 == 0 || number2 == 0){
            return  "Деление на 0 запрещено!";
        }else {
            return number1 + " / " + number2 + " = " + calculatorService.answerCalcutatorDivide(number1,number2);
        }
    }
}
