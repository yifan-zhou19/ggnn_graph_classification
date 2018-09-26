package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int m;
		int[][] a = new int[5][5];
		int flag = 0;
		int i;
		int j;
		int k;
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
				flag = 1;
			}
			if (flag == 0)
			{
				System.out.print("error\n");
			}
			else
			{
				for (i = 0;i < 5;i++)
				{
					k = i;
				if (i == n)
				{
					k = m;
				}
				if (i == m)
				{
					k = n;
				}
				for (j = 0;j < 4;j++)
				{
					System.out.printf("%d ",a[k][j]);
				}
				System.out.printf("%d\n",a[k][4]);
				}

			}
			return 0;

	}
}

