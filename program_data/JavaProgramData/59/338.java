package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		void f(int n,char str[][101],int a[][101]);
		int n;
		int m;
		int i;
		int j;
		int s = 0;
		char[][] str = new char[101][101];
		int[][] a = new int[101][101];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < n;j++)
			{
				if (j != n - 1)
				{
					String tempVar2 = ConsoleInput.scanfRead(null, 1);
					if (tempVar2 != null)
					{
						str[i][j] = tempVar2.charAt(0);
					}
				}
				else
				{
					String tempVar3 = ConsoleInput.scanfRead(null, 1);
					if (tempVar3 != null)
					{
						str[i][j] = tempVar3.charAt(0);
					}
				}
				a[i][j] = 0;
			}
		}
		String tempVar4 = ConsoleInput.scanfRead();
		if (tempVar4 != null)
		{
			m = Integer.parseInt(tempVar4);
		}
		while (m > 1)
		{
			f(n, str, a);
			m--;
		}
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < n;j++)
			{
				if (str[i][j] == '@')
				{
					s++;
				}
			}
		}
		System.out.printf("%d",s);
	}
	public static void f(int n, String[] str, int[][] a)
	{
		int i;
		int j;
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < n;j++)
			{
				if (str[i][j].equals('@') && a[i][j] == 0)
				{
					if (i + 1 < n && str[i + 1][j].equals('.'))
					{
						str[i + 1][j] = '@';
						a[i + 1][j] = 1;
					}
					if (j + 1 < n && str[i][j + 1].equals('.'))
					{
						str[i][j + 1] = '@';
						a[i][j + 1] = 1;
					}
					if (i - 1 >= 0 && str[i - 1][j].equals('.'))
					{
						str[i - 1][j] = '@';
						a[i - 1][j] = 1;
					}
					if (j - 1 >= 0 && str[i][j - 1].equals('.'))
					{
						str[i][j - 1] = '@';
						a[i][j - 1] = 1;
					}
				}
			}
		}
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < n;j++)
			{
				if (str[i][j].equals('@'))
				{
					a[i][j] = 0;
				}
			}
		}
	}
}

