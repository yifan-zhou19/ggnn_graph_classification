package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[1000];
		int[] b = new int[1000];
		int n;
		int m;
		int i = 1;
		int j = 1;
		int k = 1;
		int l = 1;
		while (true)
		{
			i = 1,j = 1,k = 1,l = 1;
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
		for (i = 1;i < n;i++)
		{
			a[i] = i;
		}
		i = 1;
		while (j < n)
		{
			while (k % m != 0)
			{
				for (l = 1;l < j;l++)
				{
					if (a[(i - 1) % n + 1] == b[l])
					{
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
						goto xunhuan;
					}
				}
				k = k + 1;
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
	xunhuan:
	i = i + 1;
			}
			while (true)
			{
				for (l = 1;l < j;l++)
				{
					if (a[(i - 1) % n + 1] == b[l])
					{
						i = i + 1;
						break;
					}
				}
				if (l == j)
				{
					break;
				}
			}
			b[j] = a[(i - 1) % n + 1];
			j = j + 1;
			k = k + 1;
			i = i + 1;
			while (true)
			{
				for (l = 1;l < j;l++)
				{
					if (a[(i - 1) % n + 1] == b[l])
					{
						i = i + 1;
						break;
					}
				}
				if (l == j)
				{
					break;
				}
			}
		}
		for (l = 1;l <= n;l++)
		{
			k = 1;
			for (i = 1;i < n;i++)
			{
				if (l != b[i])
				{
					k = k + 1;
				}
			}
			if (k == n)
			{
				break;
			}
		}
		System.out.printf("%d\n",l);
		}
		return 0;
	}

}

