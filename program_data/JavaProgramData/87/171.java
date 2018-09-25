package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int[] sz = new int[7];
	int s;
	int j;
	int i;
	for (j = 0;j < 100;j++)
	{
	for (i = 1;i < 7;i++)
	{
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			sz[i] = Integer.parseInt(tempVar);
		}
	}
	if (sz[1] == 0 && sz[2] == 0 && sz[3] == 0 && sz[4] == 0 && sz[5] == 0 && sz[6] == 0)
	{
	break;
	}
	s = (12 + sz[4]) * 3600 + sz[5] * 60 + sz[6] - sz[1] * 3600 - sz[2] * 60 - sz[3];
	System.out.printf("%d\n",s);
	}
	return 0;
	}
}

