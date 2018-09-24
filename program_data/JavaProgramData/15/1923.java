package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int[][] sz = new int[100][100];
		int i;
		int j;
		int a = -1;
		int b = -1;
		int c;
		int d;
		int n;
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
					sz[i][j] = Integer.parseInt(tempVar2);
				}
			}
		}
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < n;j++)
			{
				if (sz[i][j] == 0)
				{
					a = i;
					b = j;
					break;
				}
			}
			if (a >= 0 && b >= 0)
			{
				break;
			}
		}
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < n;j++)
			{
				if (sz[i][j] == 0)
				{
					c = i;
					d = j;
				}
			}
		}
		n = (c - a - 1) * (d - b - 1);
		System.out.printf("%d\n",n);
	}
}

