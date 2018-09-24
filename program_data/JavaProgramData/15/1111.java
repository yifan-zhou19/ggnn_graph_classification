package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i = 0;
		int a = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[] sz = new int[(n * n)];
		int k;

		for (k = 0;k < (n * n);k++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				(sz[k]) = Integer.parseInt(tempVar2);
			}
			if (sz[k] == 0)
			{
				i++;
			}
		}
		int cond = 0;
		for (k = 0;k < (n * n);k++)
		{
			if (sz[k] == 0 && cond == 0)
			{
				a++;
				if (sz[k + 1] == 255)
				{
					cond = 1;
				}
				else
				{
					continue;
				}
			}
		}
		int j;
		j = (i - (a) * 2) / 2 + 2;
		int s;
		s = (j - 2) * (a - 2);
		System.out.printf("%d\n",s);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
		free(sz);
		return 0;
	}
}

