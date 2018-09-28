package <missing>;

public class GlobalMembers
{
	public static final String a = "";
	public static final String b = "";
	public static int n;
	public static void renshu(int m, String[] a)
	{
		 int t = 0;
		 int i;
		 int j;
	if (m == 1)
	{
	  t = 0;
	   for (i = 1;i <= n;i++)
	   {
		for (j = 1;j <= n;j++)
		{
		  if (a[i][j].equals('@'))
		  {
			   t++;
		  }
		}
	   }
		   System.out.print(t);
		   System.out.print("\n");
	}
	 else
	 {
	   for (i = 1;i <= n;i++)
	   {
		for (j = 1;j <= n;j++)
		{
		 if (a[i][j].equals('@'))
		 {
			   b.charAt(i)[j] = '@';
			 if (a[i + 1][j].equals('.'))
			 {
				 b.charAt(i + 1)[j] = '@';
			 }
			 if (a[i - 1][j].equals('.'))
			 {
				 b.charAt(i - 1)[j] = '@';
			 }
			 if (a[i][j - 1].equals('.'))
			 {
				 b.charAt(i)[j - 1] = '@';
			 }
			 if (a[i][j + 1].equals('.'))
			 {
				 b.charAt(i)[j + 1] = '@';
			 }
		 }
		}
	   }
	   for (i = 1;i <= n;i++)
	   {
		for (j = 1;j <= n;j++)
		{
		 if (b.charAt(i)[j] == '@')
		 {
			 a[i][j] = b.charAt(i)[j];
		 }
		}
	   }
		renshu(m - 1, a);
	 }
	}
	public static int Main()
	{
	 int m;
	 int i;
	 int j;
	 n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	 for (i = 1;i <= n;i++)
	 {
		for (j = 1;j <= n;j++)
		{
		  a.charAt(i)[j] = ConsoleInput.readToWhiteSpace(true);
		}
	 }
	 m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	 renshu(m, a);

	 return 0;
	}


}

