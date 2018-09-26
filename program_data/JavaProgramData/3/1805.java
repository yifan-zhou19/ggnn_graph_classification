package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int m;
		int[] sz = new int[1000];
		int k;
		int i;
		int j;
		int s;
		int t;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			k = Integer.parseInt(tempVar2);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				(sz[i]) = Integer.parseInt(tempVar3);
			}
		}
		m = n * (n - 1);
		int[] h = new int[m];
		s = 0;
		t = 0;
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < n && j != i;j++)
			{
				h[s] = sz[i] + sz[j];
				s++;
			}
		}
		for (i = 0;i < s;i++)
		{
			if (h[i] == k)
			{
				t++;
			}
		}
		if (t == 0)
		{
			System.out.print("no");
		}
		else
		{
			System.out.print("yes");
		}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
		free(h);
	return 0;
	}
}

