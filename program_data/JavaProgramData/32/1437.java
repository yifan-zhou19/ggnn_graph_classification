package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int c;
		int j;
		int k;
		int m;
		char[][] a = new char[100][100];
		char[][] b = new char[100][100];
		char[][] d = new char[100][100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
		{
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			a[i] = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			b[i] = tempVar3.charAt(0);
		}
		}
		for (i = 1;i <= n;i++)
		{
			c = String.valueOf(a[i]).length() - String.valueOf(b[i]).length();
			for (j = String.valueOf(b[i]).length();j >= 0;j--)
			{
				b[i][j + c] = b[i][j];
			}
				for (k = 0;k < c;k++)
				{
				b[i][k] = '0';
				}

		}
		for (i = 1;i <= n;i++)
		{
			for (m = (String.valueOf(a[i]).length() - 1);m >= 0;m--)
			{
				if (a[i][m] >= b[i][m])
				{
					d[i][m] = a[i][m] - b[i][m] + 48;
				}
				if (a[i][m] < b[i][m])
				{
					d[i][m] = a[i][m] - b[i][m] + 58;
					a[i][m - 1] = a[i][m - 1] - 1;
				}
			}
			d[i][String.valueOf(a[i]).length()] = '\0';
		}


		for (i = 1;i <= n;i++)
		{
			System.out.printf("%s\n",d[i]);
		}
	}
}

