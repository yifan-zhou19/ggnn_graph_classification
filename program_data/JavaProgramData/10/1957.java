package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int j;
		int m;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int i;
		int[] h = new int[26];
		for (i = 1;i <= n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				h[i] = Integer.parseInt(tempVar2);
			}
		};
		int[] q = new int[26];
		for (i = 1;i <= n;i++)
		{
			q[i] = 1;
		};
		for (i = n - 1;i >= 1;i--)
		{
			m = 0;
		for (j = i + 1;j <= n;j++)
		{
		if (h[j] <= h[i])
		{
		if (m < q[j])
		{
			m = q[j];
		};
		};
		};
		q[i] = q[i] + m;
		}
	m = 0;
	for (i = 1;i <= n;i++)
	{
		if (m < q[i])
		{
			m = q[i];
		};
	};
	System.out.printf("%d",m);

	}

}

