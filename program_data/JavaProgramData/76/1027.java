package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int s;
		int m;
		int t;
		int p;
		int[] a = new int[50000];
		int[] b = new int[50000];
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
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				b[i] = Integer.parseInt(tempVar3);
			}
		}
		s = a[0];
		for (i = 1;i < n;i++)
		{
			if (a[i] < s)
			{
				s = a[i];
			}
		}
		m = b[0];
		for (i = 1;i < n;i++)
		{
			if (b[i] > b[i - 1])
			{
				m = b[i];
			}
		}
		p = 0;
		for (e = s + 0.5;e < m;e++)
		{
			t = 0;
			for (i = 0;i < n;i++)
			{
				if (e > a[i] && e < b[i])
				{
					t = 1;
				}
			}
			if (t == 0)
			{
				System.out.print("no");
				p = 1;
				break;
			}
		}
		if (p == 0)
		{
			System.out.printf("%d %d",s,m);
		}
		return 0;
	}
}

