package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int p = 0;
		int q = 0;
		int[][] sz = new int[100][100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				sz[i][0] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				sz[i][1] = Integer.parseInt(tempVar3);
			}
			if (sz[i][0] == 0)
			{
				if (sz[i][1] == 1)
				{
					p++;
				}
				if (sz[i][1] == 2)
				{
					q++;
				}
			}
			if (sz[i][0] == 1)
			{
				if (sz[i][1] == 2)
				{
					p++;
				}
				if (sz[i][1] == 0)
				{
					q++;
				}
			}
			if (sz[i][0] == 2)
			{
				if (sz[i][1] == 0)
				{
					p++;
				}
				if (sz[i][1] == 1)
				{
					q++;
				}
			}
		}
			if (p > q)
			{
				System.out.print("A");
			}
			if (p == q)
			{
				System.out.print("Tie");
			}
			if (p < q)
			{
				System.out.print("B");
			}
			return 0;
	}


}

