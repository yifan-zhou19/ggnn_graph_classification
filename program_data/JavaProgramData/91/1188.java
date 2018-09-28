package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		final String a = "";
	  int n = 0;
	  int i = 0;
	  int t = 0;

	  a = new Scanner(System.in).nextLine();
	  n = a.length();
	  for (i = 0;i < n;i++)
	  {
		   if (i != n - 1)
		   {
			t = a.charAt(i) + a.charAt(i + 1);
		  System.out.printf("%c",t);
		   }
		  else
		  {
			  t = a.charAt(0) + a.charAt(n - 1);
			 System.out.printf("%c",t);
		  }

	  }

		  return (0);


	}
}
