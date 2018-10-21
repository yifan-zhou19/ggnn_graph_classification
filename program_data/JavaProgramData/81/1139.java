package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int m;
		int n;
		int[][] a = new int[5][5];
		int f = 1;
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
			if (m < 0 || m>4 || n < 0 || n>4)
			{
				System.out.print("error"),f = 0;
			}
			else
			{
				for (j = 0;j < 5;j++)
				{
					i = a[m][j],a[m][j] = a[n][j],a[n][j] = i;
				}
			}

				if (f != 0)
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
			return 0;
	}

}

