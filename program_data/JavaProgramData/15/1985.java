package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a1;
		int a2;
		int b1;
		int b2;
		int i;
		int j;
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[][] sz = new int[1000][1000];
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < n;j++)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					sz[i][j] = Integer.parseInt(tempVar2);
				}
			}
		}
		int tag = 0;
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < n;j++)
			{
				if (sz[i][j] == 0)
				{
					a2 = i;
					b2 = j;
				}
			}
		}
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < n;j++)
			{
				if (sz[i][j] == 0 && tag == 0)
				{
					a1 = i;
					b1 = j;
					tag = 1;
				}
			}
		}
		int a;
		int b;
		a = a2 - a1 - 1;
		b = b2 - b1 - 1;
		int s;
		s = a * b;
		System.out.printf("%d",s);
		return 0;
	}

}

