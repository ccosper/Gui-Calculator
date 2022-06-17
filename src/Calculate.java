
import java.util.ArrayList;

public class Calculate {
    
    private final String opr;
    
    public Calculate(String opr){
        this.opr = opr;
    }
    
    public String enter() {
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
        return temp.toString();
    }
            
}
