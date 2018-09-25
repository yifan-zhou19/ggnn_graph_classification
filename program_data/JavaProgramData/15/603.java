package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
			int i;
			int n;
			int j;
			int sum = 0;
			int m;
			int k;
			int x;
			int[][] edge = new int[100][100];

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
					edge[i][j] = Integer.parseInt(tempVar2);
				}
			}
		}

		for (i = 0;i < n;i++)
		{
			for (j = 0;j < n;j++)
			{
			if (edge[i][j] == 0)
			{
				sum = sum + 1;
			}
			}
			if (sum > 2)
			{
				m = sum;
			break;
			}
		}

		sum = 0;
		for (j = 0;j < n;j++)
		{
			for (i = 0;i < n;i++)
			{
			if (edge[i][j] == 0)
			{
				sum = sum + 1;
			}
			}
			if (sum > 2)
			{
				k = sum;
			break;
			}
		}
		x = (k - 2) * (m - 2);


		System.out.printf("%d\n",x);
	}

}

