package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		int i;
		int j;
		int max;
		int min;
		int f = 1;
		char c;
		int[][] s = new int[8][8];
		int[] djl = new int[8];
		int[] djh = new int[8];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(null, 1);
		if (tempVar2 != null)
		{
			c = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			n = Integer.parseInt(tempVar3);
		}
		for (i = 0;i < m;i++)
		{
			for (j = 0;j < n;j++)
			{
			 String tempVar4 = ConsoleInput.scanfRead();
			 if (tempVar4 != null)
			 {
				 s[i][j] = Integer.parseInt(tempVar4);
			 }
			}
		}

		for (i = 0;i < m;i++)
		{
			max = s[i][0];
			djl[i] = 0;
			for (j = 0;j < n;j++)
			{
				if (s[i][j] > max)
				{
					max = s[i][j];
					djl[i] = j;
				}
			}
		}
		for (j = 0;j < n;j++)
		{
			min = s[0][j];
			djh[j] = 0;
			for (i = 0;i < m;i++)
			{
				if (s[i][j] < min)
				{
					min = s[i][j];
					djh[j] = i;
				}
			}
		}
		for (i = 0;i < m;i++)
		{
			for (j = 0;j < n;j++)
			{
				if (djl[i] == j && djh[j] == i)
				{
					System.out.printf("%d+%d\n",i,j);
					f = 0;
				}
			}
		}
		if (f != 0)
		{
			System.out.print("No\n");
		}
		return 0;
	}
}

