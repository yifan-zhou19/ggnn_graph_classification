package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int n;
		int m;
		int k;
		int t;
		int[] sz = new int[300];
		while (true)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				n = Integer.parseInt(tempVar);
			}
			String tempVar2 = ConsoleInput.scanfRead(" ");
			if (tempVar2 != null)
			{
				m = Integer.parseInt(tempVar2);
			}
			if (n == 0 && m == 0)
			{
				break;
			}
			for (i = 0;i < n;i++)
			{
				sz[i] = 0;
			}
			k = n,j = 0;
			for (i = 0;i < n;i = t)
			{
				t = (i + 1) % n;
				if (sz[i] != 0)
				{
					continue;
				}
				if (j++==m - 1)
				{
					sz[i] = 1;
					k--;
					j = 0;
				}
				if (k == 0)
				{
					System.out.printf("%d\n",i + 1);
					break;
				}
			}
		}
		return 0;
	}

}

