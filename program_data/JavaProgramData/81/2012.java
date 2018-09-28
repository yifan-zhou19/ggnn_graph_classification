package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[][] a = new int[5][5];
		int t;
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
		if ((n < 5 && n >= 0) && (m < 5 && m >= 0))
		{
			for (j = 0;j < 5;j++)
			{
				t = a[m][j];
				a[m][j] = a[n][j];
				a[n][j] = t;
			}
			for (i = 0;i < 5;i++)
			{
				for (j = 0;j < 4;j++)
				{
					System.out.printf("%d ",a[i][j]);
				}
				if (i != 4)
				{
					System.out.printf("%d\n",a[i][j]);
				}
				else
				{
					System.out.printf("%d",a[i][j]);
				}
			}
		}
		else
		{
			System.out.print("error");
		}
	}
}

