package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int i;
		int j;
		int m;
		int n;
		int a;
		int b;
		int t = 0;
		int[][] h = new int[8][8];
		int max;
		int min;

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
		for (i = 0;i < m;i++)
		{
			for (j = 0;j < n;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					h[i][j] = Integer.parseInt(tempVar3);
				}
			}
		}

		for (i = 0;i < m;i++)
		{
			max = h[i][0];
			for (j = 0;j < n;j++)
			{
				if (h[i][j] >= max)
				{
					max = h[i][j];
					a = j;
				}
			}
			for (i = 0;i < m;i++)
			{
				min = max;
				if (h[i][a] <= min)
				{
					min = h[i][a];
					b = i;
				}
			}
			if (max == min)
			{
				System.out.printf("%d+%d\n",b,a);
				t = 1;
				break;
			}

		}
		if (t == 0)
		{
			System.out.print("No\n");
		}

	}


}

