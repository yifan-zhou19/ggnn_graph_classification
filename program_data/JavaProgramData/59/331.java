package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int j;
		int n;
		int m;
		int t;
		int sum;
		char[][] a = new char[100][100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		System.in.read();
		for (i = 0;i < n;i++)
		{
			a[i] = new Scanner(System.in).nextLine();
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			m = Integer.parseInt(tempVar2);
		}
		for (t = 1;t < m;t++)
		{
			for (i = 0;i < n;i++)
			{
				for (j = 0;j < n;j++)
				{
					if (a[i][j] == '.' && (a[i][j + 1] == '@' || a[i][j - 1] == '@' || a[i + 1][j] == '@' || a[i - 1][j] == '@'))
					{
						a[i][j] = 'c';
					}
				}
			}
			for (i = 0;i < n;i++)
			{
				for (j = 0;j < n;j++)
				{
					if (a[i][j] == 'c')
					{
						a[i][j] = '@';
					}
				}
			}
		}
		for (i = 0,sum = 0;i < n;i++)
		{
			for (j = 0;j < n;j++)
			{
				if (a[i][j] == '@')
				{
					sum++;
				}
			}
		}
		System.out.printf("%d\n",sum);
	}

}

