import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class Solution{
public int romanToInt(String s){
  Map<Character , Integer>Map=new HashMap<>();
        Map.put('I', 1);
        Map.put('V', 5);
        Map.put('X', 10);
        Map.put('L', 50);
        Map.put('C', 100);
        Map.put('D', 500);
        Map.put('M', 1000);
    
    int total=0;
    for(int i=0;i<s.length()-1 ;i++){
        int current=Map.get(s.charAt(i));
        int next=Map.get(s.charAt(i+1));
            if(current<next){
                total -= current;
            }
            else{
                total += current;
            }
        }
            total +=Map.get(s.charAt(s.length()-1));
            return total;
    }
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the roman value");
        String roman=sc.nextLine();
            Solution obj=new Solution();
            int result=obj.romanToInt(roman);
       System.out.println(" roman valuein integer format is "+result);
       sc.close();
    }
    }      

