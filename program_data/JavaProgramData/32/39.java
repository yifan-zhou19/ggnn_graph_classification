package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int j;
		int k;
		int t;
		char[][] a = new char[100][100];
		char[][] b = new char[100][100];
		String[] c = {""};
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
					String tempVar3 = ConsoleInput.scanfRead();
					if (tempVar3 != null)
					{
						b[i] = tempVar3.charAt(0);
					}
	System.out.print("\n");
			}
			for (i = 0;i < n;i++)
			{
				for (j = String.valueOf(a[i]).length() - 1,k = String.valueOf(b[i]).length() - 1;j >= (String.valueOf(a[i]).length() - String.valueOf(b[i]).length());j--,k--)
				{
					if (a[i][j] >= b[i][k])
					{
						c[i][j] = a[i][j] - b[i][k];
					}
					else
					{
						a[i][j - 1] = a[i][j - 1] - 1;
						c[i][j] = 10 + a[i][j] - b[i][k];
					}

					c[i][j] = c[i][j] + 48;
				}
			for (t = String.valueOf(a[i]).length() - 1;t >= 0;t--)
			{
				if (a[i][t] < 48)
				{
			a[i][t - 1] = a[i][t - 1] - 1;
				}
			}
			for (t = 0;t < String.valueOf(a[i]).length();t++)
			{
			if (a[i][t] < 48)
			{
				a[i][t] = '9';
			}
			}
			for (j = 0;j < String.valueOf(a[i]).length() - String.valueOf(b[i]).length();j++)
			{
				c[i][j] = a[i][j];
			}
				c[i][String.valueOf(a[i]).length()] = '\0';
				System.out.printf("%s\n",c[i]);
			}
	}
}

