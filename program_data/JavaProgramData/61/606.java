package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int m;
		int j;
		int r;
		int[] sz = new int[1000];
		int[] s = new int[1000];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			s[0] = 1;
			s[1] = 1;
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			m = Integer.parseInt(tempVar2);
		}
		if (m == 1 || m == 2)
		{
			sz[i] = 1;
		}
		else
		{
		for (j = 2;j < m;j++)
		{
		  r = s[j - 1] + s[j - 2];
		  s[j] = r;
		}
			sz[i] = r;
		}
		}
		for (i = 0;i < n;i++)
		{
		System.out.printf("%d\n",sz[i]);
		}
		return 0;
	}

}

