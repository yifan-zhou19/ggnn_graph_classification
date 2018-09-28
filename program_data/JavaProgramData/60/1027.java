package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int k = 1;
		int[] sz = new int[100000];
		int num = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		sz[0] = 3;
		for (i = 3;i <= n;i++)
		{
			for (j = 2;j <= (i / 2);j++)
			{
				if (i % j == 0)
				{
					break;
				}
				if (j == (i / 2))
				{
					sz[k++] = i;
				}
			}
		}
		for (i = 0;i <= n;i++)
		{
			if (sz[i + 1] - sz[i] == 2)
			{
				System.out.printf("%d %d\n",sz[i],sz[i + 1]);
				num += 1;
			}
		}
		if (num == 0)
		{
			System.out.print("empty");
		}
		return 0;
	}


}

