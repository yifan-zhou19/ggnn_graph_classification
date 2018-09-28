package <missing>;

public class GlobalMembers
{
	public static int process(int[][] a, int m, int n)
	{
		int re;
		int i;
		int temp;
		if (m > -1 && m < 5 && n>-1 && n < 5)
		{
			for (i = 0;i < 5;i++)
			{
				temp = a[m][i];
				a[m][i] = a[n][i];
				a[n][i] = temp;
			}
			re = 1;
		}
		else
		{
			re = 0;
		}
		return re;
	}
	public static void Main()
	{
		int re;
		int m;
		int n;
		int[][] a = new int[5][5];
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
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			n = Integer.parseInt(tempVar3);
		}
		re = process(a, m, n);
		if (re == 0)
		{
			System.out.print("error");
		}
		else
		{
			for (i = 0;i < 5;i++)
			{
				for (j = 0;j < 4;j++)
				{
					System.out.printf("%d ",a[i][j]);
				}
				System.out.printf("%d\n",a[i][j]);
			}
		}
	}
}

