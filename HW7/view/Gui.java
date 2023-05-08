package HW7.view;

import HW7.controler.Calculator;
import HW7.controler.Logger;
import HW7.controler.NumCreator;
import HW7.model.Calculatable;
import HW7.model.Cash;
import HW7.model.ComplexNumber;
import HW7.model.Loggable;
import HW7.model.Number;

import java.util.Scanner;

public class Gui {
    NumCreator crt = new NumCreator();
    Calculator calc = new Calculator();
    Cash temp = new Cash();
    Logger logger = new Logger();
    public void run() {
        Commands com = Commands.NONE;

        while (true) {
            try {
                String command = prompt("Введите команду: ");
                com = Commands.valueOf(command.toUpperCase());

                if (com == Commands.EXIT) return;
                switch (com) {
                    case NUM:
                        createComplNum();
                        break;
                    case PLUSE:
                        sum();
                        break;
                    case MINUSE:
                        subtraction();
                        break;
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }

    private void log(String comment) {
        logger.log(comment);
    }

    private void subtraction() {
        if (temp.look() instanceof ComplexNumber) {
            System.out.println("Введите второе число.");
            log("-");
            Number res = calc.subtraction((Number) temp.fromCash(),this.createComplNum());
            temp.toCash(res);
            log("=");
            log(res.toString());
            System.out.println(res);
        }
    }

    public ComplexNumber createComplNum() {
        int ind = Integer.parseInt(prompt("Введите индекс:"));
        int mat = Integer.parseInt(prompt("Введите дейстительную часть:"));
        int img = Integer.parseInt(prompt("Введите мнимую часть:"));
        ComplexNumber complex = crt.createComplexNumber(ind, mat, img);
        log(complex.toString());
        temp.toCash(complex);
        return complex;
    }

    public void sum(){
        if (temp.look() instanceof ComplexNumber){
            System.out.println("Введите второе число.");
            log("+");
            Number res = calc.summ((Number) temp.fromCash(),this.createComplNum());
            log("=");
            log(res.toString());
            temp.toCash(res);
            System.out.println(res);
        }
    }

    private String prompt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
    }

}
