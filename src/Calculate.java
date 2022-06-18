
import java.util.ArrayList;

public class Calculate {
    
    private final String opr;
    
    public Calculate(String opr){
        this.opr = opr;
    }
    
    public double enter() {
        ArrayList<String> temp = new ArrayList<>();
        String num = "";
        for(int i = 0; i < opr.length(); i++){
            char c = opr.charAt(i);
            
            System.err.print(c+ " Adding:");
            
            switch (c) {
                case '+':
                case '-':
                case '*':
                case '/':
                case '(':
                case ')':
                    if (num != ""){
                        temp.add(num);
                    }

                    temp.add(String.valueOf(c));
                    num = "";
                    break;

                default:                              
                    num += c;

                    if (i == opr.length() - 1){
                        temp.add(num);
                    }
                    break;                    
            }           
        }        
        
        System.err.println(temp.toString());
        double result = pemdas(temp);
        System.err.println("THis is what you get after pemdas: "+ result);
        return result;
    }
    
    public double pemdas(ArrayList<String> array){
        while (!(array.size() == 1)){
            if (array.contains("(")){
                int p1, p2;
                p1 = array.indexOf("(");
                p2 = array.lastIndexOf(")");
                ArrayList<String> par = new ArrayList();

                for(int j = p1+1; j < p2; j++){
                    par.add(array.get(j));
                }

                double outcome = pemdas(par);
                array.set(p1, String.valueOf(outcome));
                array.subList(p1+1, p2).clear();                        
            }

            while (array.contains("*") || array.contains("/")){
                
                if (array.contains("*") && array.contains("/")){
                    int m, d;
                    m = array.indexOf("*");
                    d = array.indexOf("/");

                    if (m<d){
                        double num1 = Integer.parseInt(array.get(m-1));
                        double num2 = Integer.parseInt(array.get(m+1));

                        double outcome = num1 * num2;

                        //Replace the answer thw the first value and delete the operator and second value
                        //array.set(m-1, String.valueOf(outcome));
                        array.remove(m+1);
                        array.remove(m);
                        array.set(m-1, String.valueOf(outcome));

                    }
                    else{
                        double num1 = Integer.parseInt(array.get(d-1));
                        double num2 = Integer.parseInt(array.get(d+1));

                        double outcome = num1 / num2;

                        //Replace the answer thw the first value and delete the operator and second value
                        //array.set(d-1, String.valueOf(outcome));
                        array.remove(d+1);
                        array.remove(d);
                        array.set(d-1, String.valueOf(outcome));
                    }
                }
                else if (array.contains("*")){
                    int m;
                    m = array.indexOf("*");

                    double num1 = Integer.parseInt(array.get(m-1));
                    double num2 = Integer.parseInt(array.get(m+1));

                    double outcome = num1 * num2;

                    //Replace the answer thw the first value and delete the operator and second value
                    //array.set(m-1, String.valueOf(outcome));
                    array.remove(m+1);
                    array.remove(m);
                    array.set(m-1, String.valueOf(outcome));
                }
                else if (array.contains("/")){
                    int d;
                    d = array.indexOf("/");

                    double num1 = Integer.parseInt(array.get(d-1));
                    double num2 = Integer.parseInt(array.get(d+1));

                    double outcome = num1 / num2;

                    //Replace the answer thw the first value and delete the operator and second value
                    //array.set(d-1, String.valueOf(outcome));
                    array.remove(d+1);
                    array.remove(d);
                    array.set(d-1, String.valueOf(outcome));
                }
            }
            
            while (array.contains("+") || array.contains("-")){
                
                if (array.contains("+") && array.contains("-")){
                    int a, s;
                    a = array.indexOf("+");
                    s = array.indexOf("-");

                    if (a<s){
                        double num1 = Integer.parseInt(array.get(a-1));
                        double num2 = Integer.parseInt(array.get(a+1));

                        double outcome = num1 - num2;
                        
                        //Replace the answer thw the first value and delete the operator and second value
                        //array.set(a-1, String.valueOf(outcome));
                        array.remove(a+1);
                        array.remove(a);
                        array.set(a-1, String.valueOf(outcome));

                    }
                    else{
                        double num1 = Integer.parseInt(array.get(s-1));
                        double num2 = Integer.parseInt(array.get(s+1));

                        double outcome = num1 - num2;
                              
                        //Replace the answer thw the first value and delete the operator and second value
                        //array.set(s-1, String.valueOf(outcome));
                        array.remove(s+1);
                        array.remove(s);
                         array.set(s-1, String.valueOf(outcome));
                    }
                }       
                else if (array.contains("+")){
                    int a;
                    a = array.indexOf("+");
                    System.err.println("This is what num1 is: "+  Integer.parseInt(array.get(a-1)));
                    double num1 = Integer.parseInt(array.get(a-1));
                    double num2 = Integer.parseInt(array.get(a+1));
                    

                    double outcome = num1 + num2;

                    //Replace the answer thw the first value and delete the operator and second value
                   // array.set(a-1, String.valueOf(outcome));
                    array.remove(a+1);
                    array.remove(a);
                    
                    array.set(a-1, String.valueOf(outcome));

                }
                else if (array.contains("-")){
                    int s;
                    s = array.indexOf("-");

                    double num1 = Integer.parseInt(array.get(s-1));
                    double num2 = Integer.parseInt(array.get(s+1));

                    double outcome = num1 - num2;

                    //Replace the answer thw the first value and delete the operator and second value
                    //array.set(s-1, String.valueOf(outcome));
                    array.remove(s+1);
                    array.remove(s);
                    array.set(s-1, String.valueOf(outcome));
                }    
            }
        }
        
        double result = Double.valueOf(array.get(0));
        System.err.println("Return result: "+result);
        return result;
        
    }
            
}
