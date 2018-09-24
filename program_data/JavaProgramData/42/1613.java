package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int k;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[] sz = new int[100000];
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				sz[i] = Integer.parseInt(tempVar2);
			}
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			k = Integer.parseInt(tempVar3);
		}
		int sum = 0;
		int N = n;
		for (i = 0;i < N;i++)
		{
			if (sz[i] == k)
			{
				while (sz[i] == k)
				{
					for (int j = i;j < n;j++)
					{
						int c;
						c = sz[j + 1];
						sz[j + 1] = sz[j];
						sz[j] = c;
					}
					sum++;
					N--;
				}
			}
		}
		for (i = 0;i < n - sum;i++)
		{
			if (i == 0)
			{
				System.out.printf("%d",sz[i]);
			}
			else
			{
				System.out.printf(" %d",sz[i]);
			}
		}
		return 0;
	}
}

