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
		int m;
		char[][] a = new char[100][100];
		char[][] b = new char[100][100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n - 1;i++)
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
		}
		String tempVar4 = ConsoleInput.scanfRead();
		if (tempVar4 != null)
		{
			a[n - 1] = tempVar4.charAt(0);
		}
		String tempVar5 = ConsoleInput.scanfRead();
		if (tempVar5 != null)
		{
			b[n - 1] = tempVar5.charAt(0);
		}
		for (i = 0;i < n;i++)
		{
			for (j = String.valueOf(a[i]).length() - 1,k = String.valueOf(b[i]).length() - 1;k >= 0;j--,k--)
			{
				if (a[i][j] >= b[i][k])
				{
				  a[i][j] = '0' + a[i][j] - b[i][k];
				}
				else
				{
					a[i][j] = 10 + '0' + a[i][j] - b[i][k];
					if (a[i][j - 1] > '0')
					{
						a[i][j - 1]--;
					}
					else
					{
						for (t = j - 1;a[i][t] == '0';t--)
						{
							a[i][t] = '9';
						}
						a[i][t]--;
					}
				}
			}

			System.out.printf("%s\n",a[i]);
		}
	}
}

