package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int m;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[] sz = new int[100];
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				sz[i] = Integer.parseInt(tempVar2);
			}
		}
		int max = sz[0];
		int sec = sz[0];
		for (i = 0;i < n;i++)
		{
			if (sz[i] > max)
			{
				max = sz[i];
				m = i;
			}
		}
		sz[m] = -1;
		for (i = 0;i < n;i++)
		{
			if (sz[i] > sec)
			{
				sec = sz[i];
			}
		}
		System.out.printf("%d\n%d\n",max,sec);
		return 0;
	}

}

