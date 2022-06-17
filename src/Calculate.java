
import java.util.ArrayList;

public class Calculate {
    
    private final String opr;
    
    public Calculate(String opr){
        this.opr = opr;
    }
    
    public int enter() {
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
                    temp.add(num);
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
        int result = pemdas(temp);
        return result;
    }
    
    public int pemdas(ArrayList<String> array){
        while (!(array.size() == 1)){
            if (array.contains("(")){
                int p1, p2;
                p1 = array.indexOf("(");
                p2 = array.lastIndexOf(")");
                ArrayList<String> par = new ArrayList();

                for(int j = p1+1; j < p2; j++){
                    par.add(array.get(j));
                }

                int outcome = pemdas(par);
                //array.removeAll();
                array.set(p1, String.valueOf(outcome));

            }

            if (array.contains("*") || array.contains("/")){
                int m, d;
                m = array.indexOf("*");
                d = array.indexOf("/");

                if (m<d){
                    double num1 = Integer.parseInt(array.get(m-1));
                    double num2 = Integer.parseInt(array.get(m+1));

                    double outcome = num1 * num2;

                    //Replace the answer thw the first value and delete the operator and second value
                    array.set(m-1, String.valueOf(outcome));
                    array.remove(m+1);
                    array.remove(m);

                }
                else{

                }
            }
        }
        
    }
            
}
