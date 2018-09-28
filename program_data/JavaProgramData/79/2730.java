package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n = 0;
		int p;
		int i;
		int j;
		int t;
		int k;
	int[] sl = new int[301];
	int[] cz = new int[301];
	for (i = 0;i < 301;i++)
	{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				(sl[i]) = Integer.parseInt(tempVar);
			}
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				(cz[i]) = Integer.parseInt(tempVar2);
			}
			if (sl[i] == 0)
			{
				break;
			}
			n = n + 1;
	}
		k = 1;
	for (t = 0;t < n;t++)
	{
		for (i = 1;i <= sl[t];i++)
		{
			k = (k + cz[t] - 1) % i + 1;
		}
		System.out.printf("%d\n",k);
	}
	return 0;
	}

}

