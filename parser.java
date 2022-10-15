package calc;
import java.util.Arrays;    


public class parser {

    String pl_mi_substring[];
    String mul_div_substring[];
    String pw_sq_substring[];
    String br_substring[];


    public double eval(final String str){
        parser parser =  new parser();
        parser.calc_law(str);
        double res = 0;
        return res;
    }
    

    public void calc_law(String str){
        int sub_i = 0;
        int sub_i1 = 0;
        int sub_i2 = 0;
        int sub_i3 = 0;

        for (int i = 0, n = str.length(); i < n; i++) {
            char c = str.charAt(i);
            if (c == '+' || c == '-') {
                pl_mi_substring[i] = str.substring(sub_i, i);
                sub_i = i;
                
        }
    }
        if (pl_mi_substring != null){
            for (String parts : pl_mi_substring){
                for (int i_1 = 0, n_1 = parts.length(); i_1 < n_1; i_1++) {
                    char c_1 = parts.charAt(i_1);
                    if (c_1 == '*' || c_1 == '/'){
                        mul_div_substring[i_1] = parts.substring(sub_i1, i_1);
                        sub_i1 = i_1;
                    }
                }
            }

        }
        
        if (pl_mi_substring != null){
            
        for (String parts_1 : mul_div_substring){
            for (int i_2 = 0, n_2 = parts_1.length(); i_2 < n_2; i_2++) {
                char c_2 = parts_1.charAt(i_2);
                if (c_2 == '*' || c_2 == '/'){
                    mul_div_substring[i_2] = parts_1.substring(sub_i1, i_2);
                    sub_i2 = i_2;
                }
            }}}
        
        if (pl_mi_substring != null){
            for (String parts_3 : pw_sq_substring){
                for (int i_3 = 0, n_3 = parts_3.length(); i_3 < n_3; i_3++) {
                    char c_3 = parts_3.charAt(i_3);
                    if (c_3 == '^' ){
                        br_substring[i_3] = parts_3.substring(sub_i1, i_3);
                        sub_i3 = i_3;
                    }
        }}}
        
        System.out.println(pl_mi_substring);
        System.out.println(mul_div_substring);
        System.out.println(pw_sq_substring);
        System.out.println(br_substring);
    }

}


        
    //     return new Object() {
    //         int pos = -1, ch;
            
    //         void nextChar() {
    //             ch = (++pos < str.length()) ? str.charAt(pos) : -1;
    //         }
            
    //         boolean eat(int charToEat) {
    //             while (ch == ' ') nextChar();
    //             if (ch == charToEat) {
    //                 nextChar();
    //                 return true;
    //             }
    //             return false;
    //         }
            
    //         double parse() {
    //             nextChar();
    //             double x = parseExpression();
    //             if (pos < str.length()) throw new RuntimeException("Unexpected: " + (char)ch);
    //             return x;
    //         }
            
    //         // Grammar:
    //         // expression = term | expression `+` term | expression `-` term
    //         // term = factor | term `*` factor | term `/` factor
    //         // factor = `+` factor | `-` factor | `(` expression `)` | number
    //         //        | functionName `(` expression `)` | functionName factor
    //         //        | factor `^` factor
            
    //         double parseExpression() {
    //             double x = parseTerm();
    //             for (;;) {
    //                 if      (eat('+')) x += parseTerm(); // addition
    //                 else if (eat('-')) x -= parseTerm(); // subtraction
    //                 else return x;
    //             }
    //         }
            
    //         double parseTerm() {
    //             double x = parseFactor();
    //             for (;;) {
    //                 if      (eat('*')) x *= parseFactor(); // multiplication
    //                 else if (eat('/')) x /= parseFactor(); // division
    //                 else return x;
    //             }
    //         }
            
    //         double parseFactor() {
    //             if (eat('+')) return +parseFactor(); // unary plus
    //             if (eat('-')) return -parseFactor(); // unary minus
                
    //             double x;
    //             int startPos = this.pos;
    //             if (eat('(')) { // parentheses
    //                 x = parseExpression();
    //                 if (!eat(')')) throw new RuntimeException("Missing ')'");
    //             } else if ((ch >= '0' && ch <= '9') || ch == '.') { // numbers
    //                 while ((ch >= '0' && ch <= '9') || ch == '.') nextChar();
    //                 x = Double.parseDouble(str.substring(startPos, this.pos));
    //             } else if (ch >= 'a' && ch <= 'z') { // functions
    //                 while (ch >= 'a' && ch <= 'z') nextChar();
    //                 String func = str.substring(startPos, this.pos);
    //                 if (eat('(')) {
    //                     x = parseExpression();
    //                     if (!eat(')')) throw new RuntimeException("Missing ')' after argument to " + func);
    //                 } else {
    //                     x = parseFactor();
    //                 }
    //                 if (func.equals("sqrt")) x = Math.sqrt(x);
    //                 else if (func.equals("sin")) x = Math.sin(Math.toRadians(x));
    //                 else if (func.equals("cos")) x = Math.cos(Math.toRadians(x));
    //                 else if (func.equals("tan")) x = Math.tan(Math.toRadians(x));
    //                 else throw new RuntimeException("Unknown function: " + func);
    //             } else {
    //                 throw new RuntimeException("Unexpected: " + (char)ch);
    //             }
                
    //             if (eat('^')) x = Math.pow(x, parseFactor()); // exponentiation
                
    //             return x;
    //         }
    //     }.parse();
    // }



