package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int m;
		int i;
		int[] a = new int[220];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			m = Integer.parseInt(tempVar2);
		}
		for (i = 0; i < n; i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a[i] = Integer.parseInt(tempVar3);
			}
		}
		for (i = n - 1; i >= 0; i--)
		{
			a[i + m] = a[i];
		}
		for (i = 0; i < m; i++)
		{
			a[i] = a[i + n];
		}
		int flag = 0;
		for (i = 0; i < n; i++)
		{
			if (flag == 0)
			{
				System.out.printf("%d", a[i]);
				flag = 1;
				continue;
			}
			if (flag == 1)
			{
				System.out.printf(" %d", a[i]);
			}
		}
		return 0;
	}

}

