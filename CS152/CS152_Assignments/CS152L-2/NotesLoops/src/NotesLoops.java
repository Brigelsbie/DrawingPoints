public class NotesLoops
// while loop

{
    int x = 5 ;
    int i = 1 ;
    int fact = 1 ;

    while (x >=i){
        fact *= i ;
    }
}

// for loop
{ int x = 1;
int fact = 1 ;
for (int i=1;
        x >= i;
        i++)
}

public class mason {
    public static void main(String[] args) {

        String x = "mason";
        String reversedString = "";

        for(int i = x()-1; x>=0; i--){
            reversedString += x.charAt(i);
        }

        System.out.print("The reversed string of the '"+x+"' is: " );
        System.out.println(reversedString);
    }
}