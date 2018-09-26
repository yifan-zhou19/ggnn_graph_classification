package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int a;
		int b;
		int c;
		int n;
		int[] sz = new int[20];
		int[] wt = new int[20];
		sz[1] = 1;
		sz[2] = 1;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (a = 0;a < n;a++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				wt[a] = Integer.parseInt(tempVar2);
			}
		}
		for (a = 0;a <= n;a++)
		{
			b = wt[a];
			if (b == 1)
			{
				System.out.printf("%d\n",sz[1]);
			}
			else if (b == 2)
			{
				System.out.printf("%d\n",sz[2]);
			}
			else if (b >= 3)
			{
				for (c = 3;c <= b;c++)
				{
					sz[c] = sz[c - 2] + sz[c - 1];
				}
					System.out.printf("%d\n",sz[b]);
			}
		}
	}

}

