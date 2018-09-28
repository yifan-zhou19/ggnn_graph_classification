package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[22][22];
		int m;
		int n;
		int i;
		int j;
		int x = 0;
		int[] h = new int[400];
		int[] s = new int[400];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		for (i = 1;i <= m;i++)
		{
						 for (j = 1;j <= n;j++)
						 {
										  String tempVar3 = ConsoleInput.scanfRead();
										  if (tempVar3 != null)
										  {
											  a[i][j] = Integer.parseInt(tempVar3);
										  }
						 }
		}
		for (i = 1;i <= m;i++)
		{
						 for (j = 1;j <= n;j++)
						 {
										  if ((a[i][j] >= a[i - 1][j]) && (a[i][j] >= a[i + 1][j]) && (a[i][j] >= a[i][j - 1]) && (a[i][j] >= a[i][j + 1]))
										  {
																																	 h[x] = i - 1;
																																	 s[x] = j - 1;
																																	 x++;
										  }
						 }
		}
		for (i = 0;i < x;i++)
		{
						 System.out.printf("%d %d\n",h[i],s[i]);
		}
		return 0;
	}
}

