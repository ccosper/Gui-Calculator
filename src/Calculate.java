
import java.util.ArrayList;

public class Calculate {
    
    private String opr;
    
    public Calculate(String opr){
        this.opr = opr;
    }
    
    public String enter() {
        ArrayList<String> temp = new ArrayList<String>();
        for(int i = 0; i < opr.length(); i++){
            char c = opr.charAt(i);
            String num = "";
            System.err.print(c+ " This is what is being added:");
            boolean inter = false;
            int j = 0;
            
            switch (c) {
                case '+':
                    inter = false;
                    //temp.add(num);
                    temp.add(String.valueOf(c));
                    break;
                case '-':
                    inter = false;
                    temp.add(num);
                    temp.add(String.valueOf(c));
                    break;
                case '*':
                    inter = false;
                    temp.add(num);
                    temp.add(String.valueOf(c));
                    break;
                case '/':
                    inter = false;
                    temp.add(num);
                    temp.add(String.valueOf(c));
                    break;
                case '1': case '2': case '3': case '4': case '5':
                case '6': case '7': case '8': case '9': case '0':                               
                    inter = true;
                    num += c;
                    
                    if (i != opr.length() - 1){
                        temp.add(num);
                    }
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
