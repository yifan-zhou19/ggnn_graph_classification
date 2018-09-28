package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int a = 0;
		int b = 0;
		int e;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[] sz = new int[n - 1];
		for (int i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				sz[i] = Integer.parseInt(tempVar2);
			}
		}
		for (int i = 0;i < n;i++)
		{
			if (sz[i] % 2 == 1)
			{
				a++;
			}
		}
		int[] jsz = new int[a];
		for (int i = 0;i < n;i++)
		{
			if (sz[i] % 2 == 1)
			{
				jsz[b] = sz[i];
				b++;
			}
		}
		for (int i = 0;i < a - 1;i++)
		{
			for (int j = i + 1;j < a;j++)
			{
				if (jsz[i] > jsz[j])
				{
					e = jsz[i];
					jsz[i] = jsz[j];
					jsz[j] = e;
				}
			}
		}
		for (int i = 0;i < a;i++)
		{
			System.out.printf("%d",jsz[i]);
			if (i != a - 1)
			{
				System.out.print(",");
			}
		}
		return 0;
	}


}

