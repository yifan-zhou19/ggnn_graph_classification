package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] sz = new int[500];
		int n;
		int a;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (int i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				sz[i] = Integer.parseInt(tempVar2);
			}
		}
		for (i = 0;i < n;i++)
		{
			if (sz[i] % 2 == 0)
			{
				sz[i] = 0;
			}
			else
			{
				sz[i] = sz[i];
			}

		}
		for (int k = 1;k < n;k++)
		{
			for (i = 0;i < n - k;i++)
			{
				if (sz[i] >= sz[i + 1])
				{
					a = sz[i];
					sz[i] = sz[i + 1];
					sz[i + 1] = a;
				}
			}
		}


		for (i = 0;i < n;i++)
		{
			if (sz[i] != 0)
			{
				System.out.printf("%d",sz[i]);
				break;
			}
		}
		for (int j = i + 1;j < n;j++)
		{
			if (sz[j] != 0)
			{
				System.out.printf(",%d",sz[j]);
			}
		}
	return 0;
	}

}

