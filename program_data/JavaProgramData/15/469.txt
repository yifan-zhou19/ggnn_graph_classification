package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int[][] shu = new int[1000][1000];
		int n;
		int a;
		int b;
		int c;
		int d;
		int l;
		int i;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
		{
			for (j = 1;j <= n;j++)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					shu[i][j] = Integer.parseInt(tempVar2);
				}

			}
			scanf("\n");
		}
		for (i = 1;i <= n;i++)
		{
			for (j = 1;j <= n;j++)
			{
				if (shu[i][j] == 0)
				{
					a = i;
				b = j;

				break;
				}
			}
			if (a != 0)
			{
				break;
			}

		}
		for (i = n;i >= 1;i--)
		{
			for (j = n;j >= 1;j--)
			{
				if (shu[i][j] == 0)
				{
					c = i;
				d = j;
				break;
				}
			}
			if (c != 0)
			{
				break;
			}
		}
		System.out.printf("%d",(c - a - 1) * (d - b - 1));
	}

}

