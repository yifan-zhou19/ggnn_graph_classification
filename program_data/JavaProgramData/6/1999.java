package <missing>;

public class GlobalMembers
{
	public static int haha()
	{
		int m;
		int n;
		int sum;
		int i;
		int j;
		int[][] a = new int[105][105];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}





		for (i = 1;i <= m;i++)
		{
			for (j = 1;j <= n;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					*(*(a + i) + j) = tempVar3;
				}
			}
		}

			sum = 0;

			if (m == 1)
			{
			for (j = 1;j <= n;j++)
			{
				sum = sum + *(*(a + 1) + j);
			}
			}
			else
			{
				if (n == 1)
				{
					for (i = 1;i <= m;i++)
					{
						sum = sum + *(*(a + i) + 1);
					}
				}
					else
					{

			for (j = 1;j <= n;j++)
			{
				sum = sum + *(*(a + 1) + j);
			}

			for (j = 1;j <= n;j++)
			{
				sum = sum + *(*(a + m) + j);
			}

			for (i = 2;i <= m - 1;i++)
			{
				sum = sum + *(*(a + i) + 1);
			}

			for (i = 2;i <= m - 1;i++)
			{
				sum = sum + *(*(a + i) + n);
			}
					}
			}


			return (sum);
	}
	public static int Main()
	{

	int i;
	int j;
	int k;
	int l;
	int m;
	int n;
	int[] a = new int[1050];



	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	for (i = 1;i <= n;i++)
	{
	a[i] = haha();
	}


	for (i = 1;i <= n;i++)
	{
	System.out.printf("%d\n",a[i]);
	}

	}


}

