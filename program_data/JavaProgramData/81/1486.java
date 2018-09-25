package <missing>;

public class GlobalMembers
{
	public static int judge(int m,int n)
	{
		if (m == n || m > 4 || n > 4 || m < 0 || n < 0)
		{
			return 0;
		}
		else
		{
			return 1;
		}
	}
	public static void Main()
	{
		int judge = new int(int m,int n);
		int[][] a = new int[5][5];
		int m;
		int n;
		int b;
		int i;
		int j;
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
			m = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			n = Integer.parseInt(tempVar3);
		}
		if (judge(m, n) == 0)
		{
			System.out.print("error");
		}
		else
		{
			for (j = 0;j < 5;j++)
			{
			b = a[m][j];
			a[m][j] = a[n][j];
			a[n][j] = b;
			}
		for (i = 0;i < 5;i++)
		{
			for (j = 0;j < 5;j++)
			{
				System.out.printf("%d",a[i][j]);
			if (j == 4)
			{
				System.out.print("\n");
			}
			else
			{
				System.out.print(" ");
			}
			}
		}
		}
	}

}

