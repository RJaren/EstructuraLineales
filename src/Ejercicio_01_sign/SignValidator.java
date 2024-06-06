package Ejercicio_01_sign;

import Materia.PIlas.PilaGenerica;

public class SignValidator {

    public boolean isValid(String s) {
        PilaGenerica<Character> simb = new PilaGenerica<>();

        for (char m : s.toCharArray()) {
            if (m == '(' || m == '{' || m == '[') {
                simb.Push(m);
            } else if (m == ')' && !simb.isEmpty() && simb.peek() == '(') {
                simb.pop();
            }else if(m == '}' && !simb.isEmpty() && simb.peek() == '{'){
                simb.pop();
            }else if(m==']' && !simb.isEmpty() && simb.peek() == '['){
                simb.pop();
            }else {
                return false;
            }

        }

        return simb.isEmpty();

    }

}
