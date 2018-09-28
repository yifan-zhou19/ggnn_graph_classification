package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] sz = new int[300];
		int i;
		int j;
		int k = 0;
		int b;
		int c;
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
				sz[i] = Integer.parseInt(tempVar2);
			}
		}
		for (i = 0;i < n;i++)
		{
			for (j = i + 1;j < n;j++)
			{
				if (sz[i] == sz[j])
				{
					n--;
					for (k = 0;k + j < n;k++)
					{
						sz[j + k] = sz[j + k + 1];
					}
					j--;
				}
			}
		}

		for (i = 0;i < n - 1;i++)
		{
			System.out.printf("%d,",sz[i]);
		}
		System.out.printf("%d",sz[n - 1]);
		return 0;

	}


	public static int ysf(int m, int n)
	{
		int[] p;
		int i;
		int j;
		int k;

		p = new int[n];

		for (i = 0; i < n; i++)
		{
			p[i] = 0;
		}

		k = n;
		j = 1;

		for (i = 0; i < n; i = (i + 1) % n)
		{
			if (p[i] != 0)
			{
				continue;
			}
			if (j++== m)
			{
				p[i] = 1;
				k--;
				j = 1;
			}
			if (k == 0)
			{
				break;
			}
		}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
		free(p);
		return (i + 1);
	}

}

