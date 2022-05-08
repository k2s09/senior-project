import java.util.Scanner;

public class compoundPropositionSolver {
    public static String eq = "";
    public static String solvd = "";
    public static int inBr = 0;
    public static int crBr = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter equation");
        eq = sc.nextLine();
        sc.close();
        clearSpaces();
        while (containsOperator()) {
            findInnerMostBracket();
            pasteStuff(inBr);
            solveBracket();
            eq = solvd;
        }
        System.out.println(eq + " " + solvd);
    }

    public static void clearSpaces() {
        String str = eq;
        eq = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (!Character.isWhitespace(ch))
                eq += ch;
        }
    }

    public static boolean containsOperator() {
        return eq.indexOf('.') != -1 || eq.indexOf('+') != -1 || eq.indexOf('>') != -1 || eq.indexOf('=') != -1 || eq.indexOf('~') != -1;
    }

    public static void findInnerMostBracket() {
        for (int i = 0; i < eq.length(); i++) {
            char ch = eq.charAt(i);
            if (ch == '(') {
                int b1 = i;
                int b2 = correspondingBracket(eq, b1);
                String str = eq.substring((b1 + 1), b2);
                if (str.indexOf('(') == -1)
                    inBr = b1;
                crBr = b2;
            }
        }
    }

    public static int correspondingBracket(String str, int brIndex) {
        int count = 1;
        for (int i = brIndex + 1; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == '(')
                count += 1;
            if (ch == ')')
                count -= 1;
            if (count == 0)
                return i;
        }
        return count;
    }

    public static void pasteStuff(int i) {
        solvd = eq.substring(0, inBr);
    }

    public static void solveBracket() {
        String str = "(1>1)";
        // Find the operator
        char operator = ' ';
        char a = ' ', b = ' ';
        int index = 0, ans = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == '.' || ch == '+' || ch == '=' || ch == '>' || ch == '~') {
                operator = ch;
                index = i;
            }
        }
        // Finding the operators
        if (operator == '~') {
            a = str.charAt(index + 1);
        } else {
            a = str.charAt(index - 1);
            b = str.charAt(index + 1);
        }
        // Solving the bracket
        if (operator == '+') { // OR
            if (a == '1' || b == '1')
                ans = 1;
            else
                ans = 0;
        }
        if (operator == '.') { // AND
            if (a == '1' && b == '1')
                ans = 1;
            else
                ans = 0;
        }
        if (operator == '>') { // IMPLIES
            if (a == '1' && b == '0')
                ans = 0;
            else
                ans = 1;
        }
        if (operator == '=') { // EQUIVALENCE
            if (a == b)
                ans = 1;
            else
                ans = 0;
        }
        if (operator == '~') { // NEGATION
            if (a == '1')
                ans = 0;
            if (a == '0')
                ans = 1;
        }
        solvd += ans + "" + eq.substring(crBr + 1);
    }
}