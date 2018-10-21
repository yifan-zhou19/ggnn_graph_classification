package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int m;
		int b;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[] a = new int[2 * n + 2];
		for (i = 1; i <= 2 * n; i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
		}
		m = 0;
		b = 0;
		for (i = 1;i <= 2 * n;i = i + 2)
		{
			if (a[i] >= 90 && a[i] <= 140 && a[i + 1] >= 60 && a[i + 1] <= 90)
			{
				m = m + 1;
				if (m > b)
				{
					b = m;
				}
			}
			else
			{
				m = 0;
			}
		}
		System.out.printf("%d", b);

		return 0;

	}
}

