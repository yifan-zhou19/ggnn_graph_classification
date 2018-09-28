package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int sum;
		int a;
		int b;
		int m;
		int n;
		int k;
		int i;
		int j;
		int[][] num = new int[100][100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			sum = 0;
			for (a = 0;a < 100;a++)
			{
				for (b = 0;b < 100;b++)
				{
					num[a][b] = 0;
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
				k = Integer.parseInt(tempVar3);
			}
			if (m == 1 && k == 1)
			{
				String tempVar4 = ConsoleInput.scanfRead();
				if (tempVar4 != null)
				{
					j = Integer.parseInt(tempVar4);
				}
				System.out.printf("%d",j);
			}
			else if (m == 1 && k != 1)
			{
				for (a = 0;a < k;a++)
				{
					String tempVar5 = ConsoleInput.scanfRead();
					if (tempVar5 != null)
					{
						num[0][a] = Integer.parseInt(tempVar5);
					}
					sum = sum + num[0][a];
				}
				System.out.printf("%d",sum);
			}
			else if (m != 1 && k == 1)
			{
				for (a = 0;a < m;a++)
				{
					String tempVar6 = ConsoleInput.scanfRead();
					if (tempVar6 != null)
					{
						num[a][0] = Integer.parseInt(tempVar6);
					}
					sum = sum + num[a][0];
				}
				System.out.printf("%d",sum);
			}
			else
			{
			for (a = 0;a < m;a++)
			{
				for (b = 0;b < k;b++)
				{
					String tempVar7 = ConsoleInput.scanfRead();
					if (tempVar7 != null)
					{
						num[a][b] = Integer.parseInt(tempVar7);
					}
				}
			}
			for (a = 0;a < k;a++)
			{
				sum = sum + num[0][a] + num[m - 1][a];
			}
			for (a = 1;a < (m - 1);a++)
			{
				sum = sum + num[a][0] + num[a][k - 1];
			}
			System.out.printf("%d\n",sum);
			}
		}
	}
}

