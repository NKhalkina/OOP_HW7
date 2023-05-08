package HW7.model;

import java.util.Stack;

public class Cash {
    Stack<Calculatable> cash;

    public Cash() {
        this.cash = new Stack<>();
    }

    public Calculatable fromCash(){
        return this.cash.pop();
    }

    public Calculatable look(){
        return this.cash.lastElement();
    }

    public void toCash(Calculatable item){
        this.cash.push(item);
    }

}
