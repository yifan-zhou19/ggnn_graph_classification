package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[1000][1000];
		int n;
		int i;
		int j;
		int k;
		int r;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i <= n - 1;i++)
		{
			for (j = 0;j <= n - 1;j++)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					a[i][j] = Integer.parseInt(tempVar2);
				}
			}
		}
		for (i = 0;i <= n - 1;i++)
		{
			for (j = 0;j <= n - 1;j++)
			{
				if (a[i][j] == 0)
				{
					for (k = 0;j + k <= n - 1;k++)
					{
						if (a[i][j + k] != 0)
						{
							break;
						}
					}
					for (r = 0;i + r <= n - 1;r++)
					{
						if (a[i + r][j] != 0)
						{
							break;
						}
					}
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
					goto A;
				}
			}
		}
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
	A:
	System.out.printf("%d\n",(k - 2) * (r - 2));
		return 0;
	}
}

