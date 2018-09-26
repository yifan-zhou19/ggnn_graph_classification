package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int e;
		int d;
		int n;
		int ma;
		int mi;
		int[] a = new int[N];
		int[] b = new int[N];
		int[] c = new int[N];
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
				(a[i]) = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				(b[i]) = Integer.parseInt(tempVar3);
			}
			d = a[i];
			e = b[i];
			for (;d < e;d++)
			{
				if (c[d] == 0)
				{
					c[d] = 1;
				}
			}
		}
		mi = a[0];
		ma = 0;
		for (i = 0;i < n;i++)
		{
			if (a[i] < mi)
			{
				mi = a[i];
			}
			if (b[i] > ma)
			{
				ma = b[i];
			}
		}
		for (i = mi;i < ma;i++)
		{
			if (c[i] == 0)
			{
				System.out.print("no");
				return 0;
			}
		}
		System.out.printf("%d %d",mi,ma);
		return 0;
	}
}

