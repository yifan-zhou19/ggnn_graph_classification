package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[MAX][MAX];
		int n;
		int i;
		int j;
		int k;
		int h;
		int t = 0;
		int s = 0;
		int e = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0; i < n; i++)
		{
			for (j = 0; j < n; j++)
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
			for (j = 0;j < n;j++)
			{
				for (k = 1;j + k < n;k++)
				{
					if (a[i][j + k] == 0)
					{
						t += 1;
					}
				}
				for (h = 1;j - h >= 0;h++)
				{
					if (a[i][j - h] == 0)
					{
						s += 1;
					}
				}
				if (t == 1 && s == 1)
				{
					e++;
				}
				t = 0;
				s = 0;
			}
		}
		System.out.printf("%d",e);
		return 0;
	}
}

