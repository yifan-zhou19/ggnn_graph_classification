package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int m;
		int f;
		int c;
		int[] a = new int[100];
		int[] b = new int[100];
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
		i = 1;
		m = 1;
		b[0] = a[0];
		for (i = 1;i < n;i++)
		{
			c = 0;
			for (j = 0;j < i;j++)
			{
				if (a[i] == a[j])
				{
					break;
				}
				c = c + 1;
			}
			if (c == i)
			{
				b[m] = a[i];
				m = m + 1;
			}
		}
		for (f = 0;f < m - 1;f++)
		{
			System.out.printf("%d,",b[f]);
		}
		System.out.printf("%d",b[m - 1]);
		return 0;
	}
}

