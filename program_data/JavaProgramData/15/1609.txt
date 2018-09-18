package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[][] xs = new int[100][100];
		int i;
		int j;
		int x1;
		int x2;
		int y1;
		int y2;
		int S;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		y1 = 0;
		y2 = n + 1;
		for (i = 0;i < n;i++)
		{
			   for (j = 0;j < n;j++)
			   {
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				xs[i][j] = Integer.parseInt(tempVar2);
			}
			   }
		}
		for (i = 0;i < n;i++)
		{
			   x1 = 1;
			y1++;
			for (j = 0;j < n;j++)
			{
				   if (xs[i][j] != 0)
				   {
					   x1++;
				   }
				else
				{
					j = n;
					i = n;
				}
			}
		}
		for (i = n - 1;i >= 0;i--)
		{
			   x2 = n;
			y2--;
			for (j = n - 1;j >= 0;j--)
			{
				   if (xs[i][j] != 0)
				   {
					   x2--;
				   }
				else
				{
					j = -1;
					i = -1;
				}
			}
		}
		S = (y2 - y1 - 1) * (x2 - x1 - 1);
		System.out.printf("%d",S);
		return 0;
	}

}

