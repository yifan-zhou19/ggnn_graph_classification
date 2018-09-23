package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int k;
		int a1;
		int a2;
		int b1;
		int b2;
		int f = -1;
		int s = 0;
		int[][] sz = new int[1000][1000];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		System.in.read();
		for (i = 0;i < n;i++)
		{
			for (k = 0;k < n;k++)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					(sz[i][k]) = Integer.parseInt(tempVar2);
				}
				System.in.read();
				if (((sz[i][k]) == 0) && (f == -1))
				{
					 a1 = i;
					 b1 = k;
					 f = 1;
				}
				if ((sz[i][k]) == 0)
				{
					 a2 = i;
					 b2 = k;
				}
			}
		}

		s = (b2 - b1 - 1) * (a2 - a1 - 1);
		System.out.printf("%d\n",s);
		System.in.read();
		return 0;
	}

}

