package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[][] u = new char[60][33];
		char[][] a = new char[60][33];
		int n;
		int j;
		int m;
		int k;
		m = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}

		for (j = 0;j < n;j++)
		{
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			u[j] = tempVar2.charAt(0);
		}
		}

		for (j = 0;j < n;j++)
		{

		 m = String.valueOf(u[j]).length();
		if (u[j][m - 1] == 103)
		{
		if (u[j][m - 2] == 110)
		{
		if (u[j][m - 3] == 105)
		{
					   for (k = 0;k < m - 3;k++)
					   {
					   a[j][k] = u[j][k];
					   }
		}
		}
		}
						else if (u[j][m - 1] == 121)
						{
		if (u[j][m - 2] == 108)
		{
		for (k = 0;k < m - 2;k++)
		{
					   a[j][k] = u[j][k];
		}
		}
						}
						else
						{
		for (k = 0;k < m - 2;k++)
		{
					   a[j][k] = u[j][k];
		}
						}
		}
	for (j = 0;j < n;j++)
	{
	System.out.printf("%s\n",a[j]);
	}
	return 0;
	}



}

