import javafx.beans.binding.StringExpression;

import java.util.Stack;

/**
 * Created by server on 3/19/2022.
 */
public class Postfix {
    static int prec(char ch)
    {
        if (ch=='+'||ch=='-')
            return 1;
            if (ch=='*'||ch=='/')
                return 2;
        if (ch=='^')
            return 3;
        return -1;

    }
    static String Expression(String exp)
    {
        String result =new String("");
        StackPostfix<Character> stack=new StackPostfix<>();
        for (int i = 0; i <exp.length() ; i++) {
            char c=exp.charAt(i);
            if (Character.isLetterOrDigit(c))
                result+=c;
            else if (c=='(')
                stack.push(c);
            else if (c==')')
            {
                while (!stack.isEmpty()&&prec(c)<=prec(stack.top()))
                {
                    result +=stack.pop();
                }
                stack.puch(c);
            }
        }
        while (!stack.isEmpty())
        {
            if (stack.top()=='(')
                return "";
            result+= stack.pop;
        }
        return result;
    }

    public static void main(String[] args) {
        String exp="((8+3)*(5-1)/2";
        System.out.println(Expression(exp));
    }

}
