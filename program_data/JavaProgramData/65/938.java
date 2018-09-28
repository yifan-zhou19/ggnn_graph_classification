package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int k;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[][] sz = new int[1000][1000];
		for (i = 0;i < n;i++)
		{
			for (k = 0;k < 2;k++)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					sz[i][k] = Integer.parseInt(tempVar2);
				}
			}
		}
		int a = 0;
		int b = 0;
		for (i = 0;i < n;i++)
		{
				if (sz[i][0] == sz[i][1])
				{
					continue;
				}
				if ((sz[i][0] == 0 && sz[i][1] == 1) || (sz[i][0] == 1 && sz[i][1] == 2) || (sz[i][0] == 2 && sz[i][1] == 0))
				{
				a++;
				}
				else
				{
				b++;
				}

		}
		if (a > b)
		{
			System.out.print("A");
		}
		if (a < b)
		{
			System.out.print("B");
		}
		if (a == b)
		{
			System.out.print("Tie");
		}
		return 0;
	}

}

