package HW7.model;

import java.util.Stack;

public class Log {
    Stack<String> log;
    public Log() {
        this.log = new Stack<String>();
    }

    public void add(String comment){
        log.add(comment);
    }

    public String out(){
        StringBuilder res = new StringBuilder();
        for (String comment:log) {
            res
                    .append(comment)
                    .append("\n");
        }
        return res.toString();
    }
}
