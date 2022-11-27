import java.util.*;//to import the entire package of class
class coord // name of the class
{
    int i,j,start=0,vow,c;//int variables to be used in the program
    String cd,w,W;//string variables to be used in the program
    coord()//constructor to initialise member string. it has same name as that of class
    {
        cd="";// initialising string to null
    }
    void fnOperate()//member function to operate(solve the program)
    {
        fnInput();//called function fnInput() from void fnInput() function that is used to input string
        if(isValid()==false)//checking the condition of the function isvalid
        {
            System.out.println("Invalid");
        }
        else
        {
            for(i=0;i<cd.length();i++)
            {
                if(cd.charAt(i)==' '||cd.charAt(i)=='.')
                {
                w=cd.substring(start,i);
                start=i+1;
                c=0;
                vow=fnVowel(w);
                System.out.println(w+" "+vow);
            }
            }
        }
    }
    boolean isValid()
    {
        boolean flag=true;
        for(j=0;j<cd.length()-1;j++)
        {
            if(cd.charAt(j)==' ' && cd.charAt(j+1)==' ') // checking repeated space
            {
            flag=false; //if repeated space, String is invalid
            break;
            }
            else
            {
            flag=true;
            }
        }
        return(flag);
    }
    int fnVowel(String w)
    {
        W=w.toUpperCase();
        for (j=0;j<W.length();j++)
        {
        if(W.charAt(j)=='A'||W.charAt(j)=='E'||W.charAt(j)=='I'||W.charAt(j)=='O'||W.charAt(j)=='U')
        c++;
        }
        return(c);
    }
    void fnInput()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the sentences");
        cd=sc.nextLine();
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        coord ob=new coord();
        ob.fnOperate();
    }
}