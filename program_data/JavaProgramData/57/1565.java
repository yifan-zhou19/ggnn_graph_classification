package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int c;
		int j;
		char[][] a = new char[1000][100];
		char[][] b = new char[1000][100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = tempVar2.charAt(0);
			}
		}
		for (i = 0;i < n;i++)
		{
			c = String.valueOf(a[i]).length();
			if (a[i][c - 2] == 'l' || a[i][c - 2] == 'e')
			{
			   for (j = 0;j < c - 2;j++)
			   {
				   b[i][j] = a[i][j];
			   }
			}
			else
			{
			   for (j = 0;j < c - 3;j++)
			   {
				   b[i][j] = a[i][j];
			   }
			}
		}
		for (i = 0;i < n;i++)
		{
		  System.out.printf("%s\n",b[i]);
		}
		return 0;
	}

}

