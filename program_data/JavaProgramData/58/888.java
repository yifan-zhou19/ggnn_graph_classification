import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 int judge = char x[];
	/* int n;
	 n=cin.get() - 48;
	 char a[80]={'\0'};
	 for( int i = 0; i < n ; i++ )
	 {
	      cin.getline( a ,80 );
	      cout<<judge(a)<<endl<<endl;
	 }*/
	/* char a[90]={'\0'};
	 cin.getline( a ,90 );
	 cout<<judge(a)<<endl<<endl;*/
	 int n;
	 n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	 System.in.read();
	 for (int i = 0; i < n ; i++)
	 {
						final String a = "";
						a = new Scanner(System.in).nextLine();
						System.out.print(judge(a));
						System.out.print("\n");
						System.out.print("\n");
	 }
	 System.in.read();
	 System.in.read();
	 return 0;
	}
	public static int judge(String x) //?????????????????
	{
	 int rejudge = char x[];
	 if (x[0].equals('_') || (x[0].compareTo(65) >= 0 && x[0].compareTo(90) <= 0) || (x[0].compareTo(97) >= 0 && x[0].compareTo(122) <= 0))
	 {
	   if (rejudge(x) != 0)
	   {
		   return 1;
	   }
	 }
	 return 0;
	}
	public static int rejudge(String x)
	{
	 for (int i = 0 ; i < 90 ; i++)
	 {
	   if (x[i].compareTo(0) > 0 && x[i].compareTo(48) < 0 || x[i].compareTo(57) > 0 && x[i].compareTo(65) < 0 || x[i].compareTo(90) > 0 && x[i].compareTo(95) < 0 || x[i].compareTo(95) > 0 && x[i].compareTo(97) < 0 || x[i].compareTo(122) > 0)
	   {
		   return 0;
	   }
	 }
	 return 1;
	}
}

