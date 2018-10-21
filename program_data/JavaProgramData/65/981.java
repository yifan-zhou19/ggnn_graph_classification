package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[][] sz = new int[200][2];
		int i;
		int j;
		int a = 0;
		int b = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < 2;j++)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					sz[i][j] = Integer.parseInt(tempVar2);
				}
			}
		}
		for (i = 0;i < n;i++)
		{
			if (sz[i][0] == 0 && sz[i][1] == 1)
			{
				a++;
			}
			if (sz[i][0] == 1 && sz[i][1] == 2)
			{
				a++;
			}
			if (sz[i][0] == 0 && sz[i][1] == 2)
			{
				b++;
			}
			if (sz[i][0] == 1 && sz[i][1] == 0)
			{
				b++;
			}
			if (sz[i][0] == 2 && sz[i][1] == 0)
			{
				a++;
			}
			if (sz[i][0] == 2 && sz[i][1] == 1)
			{
				b++;
			}
		}
		if (a == b)
		{
			System.out.print("Tie");
		}
		if (a > b)
		{
			System.out.print("A");
		}
		if (a < b)
		{
			System.out.print("B");
		}
		return 0;
	}
}

