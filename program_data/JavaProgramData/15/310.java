package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int s = 0;
		int[][] w = new int[1000][1000];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n - 1;i++)
		{
			for (j = 0;j < n - 1;j++)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					w[i][j] = Integer.parseInt(tempVar2);
				}
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				w[i][n - 1] = Integer.parseInt(tempVar3);
			}
		}
		for (j = 0;j < n - 1;j++)
		{
				String tempVar4 = ConsoleInput.scanfRead();
				if (tempVar4 != null)
				{
					w[n - 1][j] = Integer.parseInt(tempVar4);
				}
		}
		String tempVar5 = ConsoleInput.scanfRead();
		if (tempVar5 != null)
		{
			w[n - 1][n - 1] = Integer.parseInt(tempVar5);
		}
		for (i = 2;i < n - 2;i++)
		{
			for (j = 2;j < n - 2;j++)
			{
				if (w[i][j] == 255)
				{
					s++;
				}
			}
		}
		System.out.printf("%d",s);
	}

}

