package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int n;
		int k;
		int m;
		int count;
		int q = 0;
		int[][] a = new int[5][5];
		int[] p = new int[5];
		p = a;
		for (i = 0;i < 5;i++)
		{
			for (j = 0;j < 5;j++)
			{
				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					p[i] + j = tempVar;
				}
			}
		}
		for (i = 0;i < 5;i++)
		{
			for (j = 0,m = 0,n = (p[i] + j);j < 5;j++)
			{
				if (n < *(p[i] + j))
				{
					n = (p[i] + j);
					m = j;
				}
			}
			for (k = 0,count = 0;k < 5;k++)
			{
				if (n > *(p[k] + m))
				{
					count++;
					break;
				}
			}
			if (count == 0)
			{
				System.out.printf("%d %d %d\n",i + 1,m + 1,n);
				q++;
			}
		}
		if (q == 0)
		{
			System.out.print("not found\n");
		}

	}

}

