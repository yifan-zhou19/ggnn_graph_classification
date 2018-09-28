package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j = 0;
		int h = 0;
		int[][] sz = new int[100][2];
		int[] sfzc = new int[100];
		int[] lxsc = new int[100];
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
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				sz[i][1] = Integer.parseInt(tempVar3);
			}
		}
		for (i = 0;i < n;i++)
		{
			if ((90 <= sz[i][0]) && (sz[i][0] <= 140))
			{
				if ((60 <= sz[i][1]) && (sz[i][1] <= 90))
				{
					sfzc[i] = 1;
				}
			}
		}
		for (i = 0;i < n + 1;i++)
		{
			if (sfzc[i] == 1)
			{
				j++;
			}
			else
			{
				lxsc[i] = j;
				j = 0;
			}
		}
		for (i = 0;i < n + 1;i++)
		{
			if (h < lxsc[i])
			{
				h = lxsc[i];
			}
		}
		System.out.printf("%d",h);
		return 0;
	}


}

