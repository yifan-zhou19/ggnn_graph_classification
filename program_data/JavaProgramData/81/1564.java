package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int b;
		int n;
		int m;
		int[][] a = new int[5][5];
		int i;
		int j;
		int decide = new int(int n,int m);
		void change(int n,int m,int a[5][5]);
		for (i = 0;i < 5;i++)
		{
			for (j = 0;j < 5;j++)
			{
				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					a[i][j] = Integer.parseInt(tempVar);
				}
			}
		}
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				n = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				m = Integer.parseInt(tempVar3);
			}
		b = decide(n, m);
		if (b == 0)
		{
			System.out.print("error");
		}
		if (b == 1)
		{
			change(n, m, a);
		}
	}
	public static int decide(int n,int m)
	{
		int a;
		if (n >= 0 && n < 5 && m >= 0 && m < 5)
		{
			a = 1;
		}
		else
		{
			a = 0;
		}
		return (a);
	}
	public static void change(int n, int m, int[][] a)
	{
		int b;
		int i;
		int j;
		for (j = 0;j < 5;j++)
		{
			b = a[n][j];
			a[n][j] = a[m][j];
			a[m][j] = b;
		}
		for (i = 0;i < 5;i++)
		{
			for (j = 0;j < 4;j++)
			{
				System.out.printf("%d ",a[i][j]);
			}
			System.out.printf("%d\n",a[i][4]);
		}
	}
}

