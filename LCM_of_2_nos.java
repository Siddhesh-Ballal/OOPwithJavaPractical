import java.util.*;

public class LCM_of_2_nos {
    public static void main(String[] args) {
        Scanner i = new Scanner(System.in);
        int n1, n2;

        System.out.println("Enter 1st number: ");
        n1 = i.nextInt();
        System.out.println("Enter 2nd number: ");
        n2 = i.nextInt();

        int LCM = LCM(n1, n2);
        System.out.println("LCM of " + n1 + " and " + n2 + " = " + LCM);
    }

    static int LCM(int a, int b) {
        int lcm;
        if (a<=b) 
            lcm=b;
        
        else
            lcm=a;
        
        while(lcm <= (a*b)) {
            if(lcm%a==0 && lcm%b==0) 
                return lcm;
            lcm++;
        }  
        return a*b; 
    }


}
