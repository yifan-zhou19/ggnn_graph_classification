package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		 int[][] sz = new int[100][100];
		 int n;
		 int p;
		 int q;
		 int i;
		 int k;
		 int a;
		 int b;
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				n = Integer.parseInt(tempVar);
			}
			for (i = 0;i < n;i++)
			{
				for (k = 0;k < n;k++)
				{
					String tempVar2 = ConsoleInput.scanfRead();
					if (tempVar2 != null)
					{
						(sz[i][k]) = Integer.parseInt(tempVar2);
					}
					if (sz[i][k] == 0)
					{
					p = i;
					q = k;
					}
				}
			}
			for (i = n - 1;i >= 0;i--)
			{
				for (k = n - 1;k >= 0;k--)
				{
					if (sz[i][k] == 0)
					{
					a = i;
					b = k;
					}
				}
			}
				System.out.printf("%d",(p - a - 1) * (q - b - 1));
				return 0;
	}


}

