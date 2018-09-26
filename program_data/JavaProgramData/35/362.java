package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int m;
		int n;
		int i;
		int j;
		int t;
		int a;
		int b;
		int s = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(",");
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		int[][] num = new int[8][8];
		int max;
		for (i = 0;i < m;i++)
		{
			for (j = 0;j < n;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					num[i][j] = Integer.parseInt(tempVar3);
				}
			}
		}
		for (i = 0;i < m;i++)
		{
			t = 0;
			max = 0;
			for (j = 0;j < n;j++)
			{
				if (num[i][j] > max)
				{
					max = num[i][j];
					b = j;
				}
			}
			for (a = 0;a < m;a++)
			{
				if (a != i && max < num[a][b])
				{
				   t += 1;
				}
			}
			if (t == m - 1)
			{
			System.out.printf("%d+%d",i,b);
			s = 1;
			}
		}
		if (s == 0)
		{
		System.out.print("No");
		}
	}
}

