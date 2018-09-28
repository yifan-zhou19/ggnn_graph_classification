package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int m;
		int n;
		int p;
		int[] a = new int[100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i <= n - 1;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
			if (i == 1)
			{
				if (a[0] > a[1])
				{
					m = a[0];
					p = a[1];
				}
				else if (a[0] < a[1])
				{
					m = a[1];
					p = a[0];
				}
			}
			if (i > 1)
			{
				if (a[i] > m)
				{
					p = m;
					m = a[i];
				}
				else if ((a[i] > p) && (a[i] < m) == 1)
				{
					m = m;
					p = a[i];
				}
			}
		}
		System.out.printf("%d\n",m);
		System.out.printf("%d\n",p);
		return 0;

	}
}

