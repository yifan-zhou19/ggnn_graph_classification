package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int n;
		int s;
		int t;
		int r;
		int l;
		char[][] a = new char[51][1000];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
		{
			a[i] = new Scanner(System.in).nextLine();
		  l = String.valueOf(a[i]).length();
		  if (a[i][l - 1] == 'r')
		  {
			  for (j = 0;j < l - 2;j++)
			  {
				  System.out.printf("%c",a[i][j]);
			  }
		  }
		  else if (a[i][l - 1] == 'y')
		  {
			  for (j = 0;j < l - 2;j++)
			  {
				  System.out.printf("%c",a[i][j]);
			  }
		  }
		  else if (a[i][l - 1] == 'g')
		  {
			  for (j = 0;j < l - 3;j++)
			  {
				  System.out.printf("%c",a[i][j]);
			  }
		  }
		 System.out.print("\n");
		}
	}

}

