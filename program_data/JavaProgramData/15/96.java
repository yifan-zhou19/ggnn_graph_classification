package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] N = new int[1000][1000];
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int i;
		int j;
		int m;
		int a = 0;
		int b = 0;
		int count = 0;
		for (i = 0;i < n;i++)
		{
			m = 0;
			for (j = 0;j < n;j++)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					N[i][j] = Integer.parseInt(tempVar2);
				}
				if (N[i][j] == 0)
				{
					m++,count++;
				}
			}

				if (m >= 1)
				{
					a++;
				}
				if (m > b)
				{
					b = m;
				}
		}
				int sum;
				sum = a * b - count;
				System.out.printf("%d",sum);
				return 0;
	}
}

