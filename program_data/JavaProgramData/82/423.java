package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		int[] a = new int[101];
		int[] b = new int[101];
		int[] c = new int[101];
		for (i = 0;i < m;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				b[i] = Integer.parseInt(tempVar3);
			}
			if (90 <= a[i] != 0 && 140 >= a[i] != 0 && 60 <= b[i] != 0 && 90 >= b[i])
			{
				c[i] = 1;
			}
			else
			{
				c[i] = 0;
			}
		}
		int q = 0;
		int p = 0;
		for (i = 0;i < m;i++)
		{
			if (c[i] == 1)
			{
				p++;
			}
			if (p > q)
			{
				q = p;
			}
			if (c[i] == 0)
			{
				p = 0;
				continue;
			}
		}
		System.out.printf("%d",q);
		return 0;
	}

}

