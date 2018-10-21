package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] a = new int[100];
		int m1;
		int i;
		int m2;
		int p;
		int q;
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
		}
		if (a[0] > a[1])
		{
			m1 = a[0];
			m2 = a[1];
		}
		else
		{
			m1 = a[1];
			m2 = a[0];
		}
		for (i = 2;i < n;i++)
		{
			p = m1;
			q = m2;
			if (a[i] >= p)
			{
				m2 = m1;
				m1 = a[i];
			}
		}
		System.out.printf("%d\n%d",m1,m2);
		return 0;
	}
}

