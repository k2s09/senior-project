// Steps
// Clear spaces
// Find innermost '('
// Paste stuff before that bracket in solvd
// Solve bracket
// Append the answer and rest of equation solvd

import java.util.Scanner;

public class CPSolver {

    static String eq = "";
    static String solvd = "";
    static int InBr = 0;
    static int CrBr = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Operators: ");
        System.out.println("AND .\nOR + \nIMPLIES >\nBICONDITIONAL =\nNEGATION ~");
        System.out.println("Enter compound proposition:");
        eq = sc.nextLine();
        sc.close();
        // Start the functions
        clearSpaces();
        while (containsOperator()) {
            findInnerMostBracket();
            pasteStuff();
            solveBracket();
            solvd = eq;
        }
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

    public static void findInnerMostBracket() { // The innermost bracket of the equation will be worked on first
        for (int i = 0; i < eq.length(); i++) {
            int a = eq.charAt(i);
            if (a == '(') {
                findClosingParen();
                int b = CrBr;
                String sub = eq.substring(a, b + 1);
                if (sub.indexOf('(') == -1)
                    InBr = a;
            }
        }
    }

    public static void findClosingParen() { // Finds the matching bracket of the the bracket asked
        char[] text = eq.toCharArray();
        int closePos = InBr;
        int counter = 1;
        while (counter > 0) {
            char c = text[++closePos];
            if (c == '(') {
                counter++;
            } else if (c == ')') {
                counter--;
            }
        }
        CrBr = closePos;
    }

    public static void pasteStuff() {
        solvd = eq.substring(0, InBr);
    }

    public static void solveBracket() {
        String str = eq.substring(InBr, CrBr + 1);
        char operator = 0, a = 0, b = 0;
        int index = 0;
        for (int i = 0; i < str.length(); i++) { // Finding the operator
            char ch = str.charAt(i);
            if (ch == '+' || ch == '.' || ch == '>' || ch == '=' || ch == '~') {
                operator = ch;
                index = i;
            }
        }
        if (operator == '~') {
            a = str.charAt(index + 1);
        } else {
            a = str.charAt(index - 1);
            b = str.charAt(index + 1);
        }
        int ans = 0;
        if (operator == '+') { // OR
            if (a == '1' || b == '1')
                ans = 1;
            else
                ans = 0;
        }
        if (operator == '.') { // AND
            if (a == 1 && b == 1)
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
            if (a == 1)
                ans = 0;
            if (a == 0)
                ans = 1;
        }
        solvd += ans + eq.substring(CrBr + 1);
    }
}