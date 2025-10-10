package homeworks.homework2;

import java.util.Stack;

public class BraceChecker {
    private final String text;

    public BraceChecker(String text) {
        this.text = text;
    }

    public void check() {
        Stack<Bracket> stack = new Stack<>();

        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (isOpen(c)) {
                stack.push(new Bracket(c, i));
            } else if (isClose(c)) {
                if (stack.isEmpty()) {
                    System.out.println("Error: closed " + c + " but no matching open at " + i);
                    return;
                }
                Bracket top = stack.pop();
                if (!matches(top.ch, c)) {
                    System.out.println("Error: opened " + top.ch + " but closed " + c + " at " + i);
                    return;
                }
            }
        }

        if (!stack.isEmpty()) {
            Bracket left = stack.pop();
            System.out.println("Error: opened " + left.ch + " but not closed (at " + left.index + ")");
        } else {
            System.out.println("No errors: all braces matched");
        }
    }

    private boolean isOpen(char c) {
        return c == '{' || c == '[' || c == '(';
    }

    private boolean isClose(char c) {
        return c == '}' || c == ']' || c == ')';
    }

    private boolean matches(char open, char close) {
        return (open == '{' && close == '}')
                || (open == '[' && close == ']')
                || (open == '(' && close == ')');
    }

    private static class Bracket {
        char ch;
        int index;
        Bracket(char ch, int index) {
            this.ch = ch;
            this.index = index;
        }
    }


    public static void main(String[] args) {
        BraceChecker bc1 = new BraceChecker("Hello from [Java]");
        bc1.check();

        BraceChecker bc2 = new BraceChecker("Hello from [Java)");
        bc2.check();
    }
}


