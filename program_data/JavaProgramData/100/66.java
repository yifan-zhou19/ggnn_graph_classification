package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String a = new String(new char[300]);
		char m;
	  int n;
	  int s;
	  int k = 0;
	  int i;
	  a = new Scanner(System.in).nextLine();
	  n = a.length();
	 for (m = 'a';m <= 'z';m++)
	 {
		  s = 0;
	   for (i = 0;i <= n - 1;i++)
	   {
			if (a.charAt(i) == m)
			{
		  s = s + 1;
			}
		 else
		 {
			 ;
		 }
	   }
	   if (s != 0)
	   {
		   System.out.printf("%c=%d\n",m,s);
		   k = k + 1;
	   }
	   else
	   {
		   ;
	   }
	 }
	 if (k == 0)
	 {
	 System.out.print("No");
	 }
	}
}
