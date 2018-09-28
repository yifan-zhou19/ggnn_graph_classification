package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] m = new int[500];
		int[] w = new int[500];
		int i;
		int k;
		int j;
		int q = 0;
		int b;
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
				m[i] = Integer.parseInt(tempVar2);
			}
		}
		for (i = 0;i < n;i++)
		{
			if (m[i] % 2 != 0)
			{
			w[q] = m[i];
			q = q + 1;
			}
		}
		b = q;
		for (i = 1;i < q + 1;i++)
		{
		for (j = i;j > 0;j--)
		{
		if (w[j - 1] <= w[j])
		{
						w[j] = w[j];
						w[j - 1] = w[j - 1];
		}
			else
			{
				k = w[j];
				w[j] = w[j - 1];
				w[j - 1] = k;
			}
		}
		}
	for (i = 1;i < b;i++)
	{
		System.out.printf("%d,",w[i]);
	}
	System.out.printf("%d",w[b]);
			return 0;
	}

}

