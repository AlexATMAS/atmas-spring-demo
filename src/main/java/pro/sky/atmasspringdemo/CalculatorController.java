package pro.sky.atmasspringdemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

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


    @RequestMapping("/plus")
    public String answerCalcutatorPlus  (@RequestParam("num1") String number1,@RequestParam("num2") String number2) {
        return calculatorService.answerCalcutatorPlus(number1,number2);
    }

    @RequestMapping("/minus")
    public String answerCalcutatorMinus  (@RequestParam("num1") String number1,@RequestParam("num2") String number2) {
        return calculatorService.answerCalcutatorMinus(number1,number2);
    }

    @RequestMapping("/multiply")
    public String answerCalcutatorMultiply  (@RequestParam("num1") String number1,@RequestParam("num2") String number2) {
        return calculatorService.answerCalcutatorMultiply(number1,number2);
    }

    @RequestMapping("/divide")
    public String answerCalcutatorDivide  (@RequestParam("num1") String number1,@RequestParam("num2") String number2) {
        return calculatorService.answerCalcutatorDivide(number1,number2);
    }

}
