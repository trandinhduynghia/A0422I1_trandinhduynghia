package Refactoring;

public class CalculatorTest {
    public static void main(String[] args){
        Calculator calculator = new Calculator();
        System.out.println(calculator.calculate(1,1,'+'));
        System.out.println(calculator.calculate(1,1,'-'));
        System.out.println(calculator.calculate(1,1,'*'));
        System.out.println(calculator.calculate(1,1,'/'));
    }
}
