package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int m;
		int i;
		int e;
		int k;
		int a;
		int[] sz = new int[1000];
		int[] js = new int[1000];
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
		a = 0;
		for (i = 0;i < n;i++)
		{
			if (sz[i] % 2 != 0)
			{
				js[a] = sz[i];
				a++;
			}
		}
		for (k = 1;k <= a;k++)
		{
			m = 0;
		for (i = 0;i <= a - k;i++)
		{
			if (js[i] > js[m])
			{
				m = i;
			}
		}
			if (js[m] != js[a - k])
			{
				e = js[a - k];
				js[a - k] = js[m];
				js[m] = e;
			}
		}
		for (i = 0;i < a;i++)
		{
			if (i == a - 1)
			{
				System.out.printf("%d",js[i]);
			}
			else
			{
				System.out.printf("%d,",js[i]);
			}
		}
		return 0;
	}

}

