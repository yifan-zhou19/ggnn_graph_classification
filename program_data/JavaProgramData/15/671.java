package <missing>;

public class GlobalMembers
{
	public static int[][] cancer = new int[1000][1000];
	public static void Main()
	{

		int i;
		int n;
		int j;
		int k1;
		int k2;
		int m1;
		int m2;
		int sum = 0;
		int s;
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
					cancer[i][j] = Integer.parseInt(tempVar2);
				}
			}
		}
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < n;j++)
			{
				if (cancer[i][j] == 0)
				{
				k1 = i;
				m1 = j;
				s = 1;
				break;
				}
			}
				if (s == 1)
				{
					s = 0;
					break;
				}
		}
		for (i = n - 1;i >= 0;i--)
		{
			for (j = n - 1;j >= 0;j--)
			{
				if (cancer[i][j] == 0)
				{
					k2 = i;
					m2 = j;
					s = 1;
					break;
				}
			}
			if (s == 1)
			{
				break;
			}
		}
		for (i = k1;i <= k2;i++)
		{
			for (j = m1;j <= m2;j++)
			{
				if (cancer[i][j] == 255)
				{
					sum++;
				}
			}
		}
		System.out.printf("%d",sum);

	}



}

