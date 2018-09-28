package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[50001];
		int[] b = new int[50001];
		int n;
		int i;
		int m;
		int f;
		int s;
		double e;
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
				a[i] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				b[i] = Integer.parseInt(tempVar3);
			}
		}
		s = a[0];
		for (i = 0;i < n;i++)
		{
			if (s > a[i])
			{
				s = a[i];
			}
		}
		m = b[0];
		for (i = 0;i < n;i++)
		{
			if (m < b[i])
			{
				m = b[i];
			}
		}

		for (e = s + 0.5;e < m;e++)
		{
			for (i = 0,f = 0;i < n;i++)
			{
				if (a[i] < e && b[i]> e)
				{
					f = 1;
				}
			}
			if (f == 0)
			{
				break;
			}
		}
		if (f == 1)
		{
			System.out.printf("%d %d",s, m);
		}
		else
		{
		System.out.print("no");
		}
		return 0;
	}

}

