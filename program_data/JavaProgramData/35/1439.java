package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
		int[][] sz = new int[8][8];
		int i;
		int j;
		int z;
		int p;
		int q;
		int r;
		int t;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(",");
		if (tempVar2 != null)
		{
			b = Integer.parseInt(tempVar2);
		}
		i = 0;
		j = 0;
		z = 0;
		t = 0;
		for (i = 0;i < a;i++)
		{
			for (j = 0;j < b;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					sz[i][j] = Integer.parseInt(tempVar3);
				}
			}
		}

		for (i = 0;i < a;i++)
		{
			for (j = 0;j < b;j++)
			{
				for (z = 0,q = 0;z < b;z++)
				{
					if (sz[i][z] <= sz[i][j])
					{
					q++;
					}
				}
				for (r = 0,p = 0;r < a;r++)
				{
					if (sz[r][j] >= sz[i][j])
					{
					p++;
					}
				}
				if (p >= a != 0 && q >= b)
				{
					System.out.printf("%d+%d",i,j);
				t = 1;
				}
			}
		}
		if (t != 1)
		{
			System.out.print("No");
		}
		return 0;
	}
}

