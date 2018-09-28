package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int a;
		int b;
		int t;
		int l = 0;
		int[] ai = new int[50000];
		int[] bi = new int[50000];
		int[] sz = new int[10000];
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
				ai[i] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				bi[i] = Integer.parseInt(tempVar3);
			}
		}
		for (t = 0;t < 10000;t++)
		{
			sz[t] = 0;
		}
		for (i = 0;i < n;i++)
		{
			if (ai[i] == bi[i])
			{
			t = ai[i] - 1;
			sz[t] = 1;
			}
			for (t = ai[i] - 1;t < bi[i] - 1;t++)
			{
				sz[t] = 1;
			}
		}
		a = ai[0];
		b = bi[0];
		for (i = 1;i < n;i++)
		{
			if (a > ai[i])
			{
			a = ai[i];
			}
			if (b < bi[i])
			{
			b = bi[i];
			}
		}
		sz[b - 1] = 1;
		for (t = a - 1;t < b;t++)
		{
			if (sz[t] == 0)
			{
			   System.out.print("no");
			   l = 1;
			   break;
			}
		}
		if (l == 0)
		{
		System.out.printf("%d %d",a,b);
		}

		return 0;
	}



}

