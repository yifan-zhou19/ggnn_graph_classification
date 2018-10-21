package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int N;
		int i;
		int e;
		int l;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			N = Integer.parseInt(tempVar);
		}
		int[] sz = new int[500];
		for (i = 0;i < N;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				sz[i] = Integer.parseInt(tempVar2);
			}
		}
		int[] js = new int[500];
		int j = 0;
		int n = 0;
		for (i = 0;i < N;i++)
		{
			if (sz[i] % 2 == 1)
			{
				js[j] = sz[i];
				j = j + 1;
				n = n + 1;
			}
		}
		for (l = n - 1;l > 0;l--)
		{
		for (j = 0;j < l;j++)
		{
			if (js[j] > js[j + 1])
			{
				e = js[j + 1];
				js[j + 1] = js[j];
				js[j] = e;
			}
		}
		}
		for (j = 0;j < n - 1;j++)
		{
			System.out.printf("%d,",js[j]);
		}
		System.out.printf("%d",js[n - 1]);
		return 0;
	}
}

