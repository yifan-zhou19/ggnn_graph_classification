package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[1000][1000];
		int i;
		int j;
		int s = 0;
		int e;
		int b;
		int c;
		int d = 0;
		int n = 0;
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
					a[i][j] = Integer.parseInt(tempVar2);
				}
			}
		}
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < n - 1;j++)
			{
				if (a[i][j] < a[i][j + 1])
				{
					e = i;
					b = j;
					break;
				}
			}
		}
		for (i = n - 1;i >= 0;i--)
		{
			for (j = n - 1;j > 0;j--)
			{
			  if (a[i][j] < a[i][j - 1])
			  {
				  c = i;
				  d = j;
				  break;
			  }
			}
		}
		s = (c - e+1) * (d - b + 1);
		System.out.printf("%d",s);
		return 0;
	}
}

