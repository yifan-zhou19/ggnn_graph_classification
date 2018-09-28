package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[][] a = new int[10][10];
		int i;
		int j;
		int n;
		int m;
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
		if (n >= 0 && n <= 4 && m >= 0 && m <= 4)
		{
			int[] c = new int[10];
			int[] d = new int[10];
			for (i = 0;i < 5;i++)
			{
				c[i] = a[n][i];
				d[i] = a[m][i];
			}
			for (i = 0;i < 5;i++)
			{
				a[n][i] = d[i];
				a[m][i] = c[i];
			}
			for (i = 0;i < 4;i++)
			{
				for (j = 0;j < 4;j++)
				{
					System.out.printf("%d ",a[i][j]);
				}
				System.out.printf("%d\n",a[i][4]);
			}
			for (j = 0;j < 4;j++)
			{
				System.out.printf("%d ",a[4][j]);
			}
			System.out.printf("%d",a[4][4]);
		}
		else
		{
			System.out.print("error");
		}
	}
}

