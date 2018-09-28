package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int[] sz = {1, 1, 1, 1, 1, 1};
	int x;
	int i;
	int j;
	for (i = 0;;i++)
	{
		for (j = 0;j < 6;j++)
		{
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			sz[j] = Integer.parseInt(tempVar);
		}
		}
		if (sz[0] == 0)
		{
		break;
		}
		x = (sz[3] + 12 - sz[0]) * 3600 - sz[1] * 60 - sz[2] + sz[4] * 60 + sz[5];
		System.out.printf("%d\n",x);

	}
	return 0;
	}

}

