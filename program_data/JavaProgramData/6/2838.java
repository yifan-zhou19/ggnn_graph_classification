package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int k;
		int[] n = new int[1000];
		int[] m = new int[1000];
		int a;
		int b;
		int c;
		int[][] s = new int[100][100];
		int[] x = new int[1000];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}
		for (a = 0;a < k;a++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				m[a] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				n[a] = Integer.parseInt(tempVar3);
			}
			for (b = 0;b < m[a];b++)
			{
				for (c = 0;c < n[a];c++)
				{
					String tempVar4 = ConsoleInput.scanfRead();
					if (tempVar4 != null)
					{
						s[b][c] = Integer.parseInt(tempVar4);
					}
				}
			}
			x[a] = 0;
				for (c = 0;c < n[a];c++)
				{
					if (m[a] > 1)
					{
				x[a] = x[a] + s[0][c] + s[m[a] - 1][c];
					}
			else
			{
				x[a] = x[a] + s[0][c];
			}
				}
		   if (m[a] > 2)
		   {
		   if (n[a] > 1)
		   {
			   for (b = 1;b < m[a] - 1;b++)
			   {
				x[a] = x[a] + s[b][0] + s[b][n[a] - 1];
			   }
		   }
		   else
		   {
			   x[a] = x[a] + s[b][0];
		   }
		   }
			System.out.printf("%d\n",x[a]);
		}
		return 0;
	}

}

