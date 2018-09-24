package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[][] number = new int[100][100];
		int i;
		int p;
		int o;
		int u;
		int count;
		int min;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (o = 0;o < n;o++)
		{
			for (i = 0;i < n;i++)
			{
				for (p = 0;p < n;p++)
				{
					String tempVar2 = ConsoleInput.scanfRead();
					if (tempVar2 != null)
					{
						number[i][p] = Integer.parseInt(tempVar2);
					}
				}
			}
				   count = 0;
			for (u = 0;u < n - 1;u++)
			{
			for (i = 0;i < n - u;i++)
			{
				min = 999999;
				for (p = 0;p < n - u;p++)
				{
					if (min > number[i][p])
					{
						min = number[i][p];
					}
				}
				for (p = 0;p < n - u;p++)
				{
					number[i][p] -= min;
				}
			}
			for (p = 0;p < n - u;p++)
			{
				min = 999999;
				for (i = 0;i < n - u;i++)
				{
					if (min > number[i][p])
					{
						min = number[i][p];
					}
				}
				for (i = 0;i < n - u;i++)
				{
					number[i][p] -= min;
				}
			}
			count += number[1][1];
			for (i = 1;i < n - u - 1;i++)
			{
				number[i][0] = number[i + 1][0];
			}
			for (p = 1;p < n - u - 1;p++)
			{
				number[0][p] = number[0][p + 1];
			}
			for (p = 1;p < n - u - 1;p++)
			{
				for (i = 1;i < n - u - 1;i++)
				{
					number[i][p] = number[i + 1][p + 1];
				}
			}
			}
			System.out.printf("%d\n",count);
		}


		 return 0;
	}




}

