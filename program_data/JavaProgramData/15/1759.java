package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int k = 0;
		int m = 0;
		int[][] a = new int[1000][1000];
		int flag = 0;
		int number;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < n;j++)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					a[j][i] = Integer.parseInt(tempVar2);
				}
			}
		}
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < n;j++)
			{
				if (a[j][i] == 0)
				{
					k++;
					flag = 1;
				}
				if (flag == 1)
				{
					if (a[j][i] == 255)
					{
						break;
					}
				}
			}
		}
		flag = 0;
		for (j = 0;j < n;j++)
		{
			for (i = 0;i < n;i++)
			{
				if (a[j][i] == 0)
				{
					m++;
					flag = 1;
				}
				if (flag == 1)
				{
					if (a[j][i] == 255)
					{
						break;
					}
				}
			}
		}
		number = (k - 2) * (m - 2);
		System.out.printf("%d\n",number);
		return 0;
	}

}

