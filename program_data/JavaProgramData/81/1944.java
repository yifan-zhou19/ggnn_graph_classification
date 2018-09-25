package <missing>;

public class GlobalMembers
{
	public static int panduan(int m,int n)
	{

		if (m > 4)
		{
			return 0;
		}
		if (n > 4)
		{
			return 0;
		}

		return 1;
	}
	public static void Main()
	{
		int i;
		int j;
		int[][] a = new int[5][5];
		int[] c = new int[5];
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

		int m;
		int n;
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
		if (panduan(m, n) == 0)
		{
			System.out.print("error\n");
		}
		else
		{
				for (i = 0;i < 5;i++)
				{
			c[i] = a[m][i];
			a[m][i] = a[n][i];
			a[n][i] = c[i];
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
}

