package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int b = 0;
		int k = 0;
		int[] sz = new int[10000];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (int i = 1;i <= n;i++)
		{
			int s = 0;
			for (int j = 2;j < i;j++)
			{
				if (i % j == 0)
				{
					s++;
				}
			}
			if (s == 0)
			{
				sz[k] = i;
				k++;
			}
		}
		for (int a = 0;a <= 10000;a++)
		{
			if (sz[a + 1] - sz[a] == 2)
			{
				System.out.printf("%d %d\n",sz[a],sz[a + 1]);
				b++;
			}
		}
		if (b == 0)
		{
			System.out.print("empty");
		}
		return 0;
	}

}

