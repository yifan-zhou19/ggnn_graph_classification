package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] sz = new int[100];
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (int m = 0;m < n;m++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				sz[m] = Integer.parseInt(tempVar2);
			}
		}
		if (n % 2 == 0)
		{
			for (int i = 0;i < n / 2;i++)
			{
				int e;
				e = sz[i];
				sz[i] = sz[n - i - 1];
				sz[n - i - 1] = e;
			}
		}
		else
		{
			for (int k = 0;k <= (n - 1) / 2;k++)
			{
				int f;
				f = sz[n - 1 - k];
				sz[n - 1 - k] = sz[k];
				sz[k] = f;

			}
		}
		for (int a = 0;a < n - 1;a++)
		{
			System.out.printf("%d ",sz[a]);

		}
			System.out.printf("%d",sz[n - 1]);
		return 0;
	}
}

