package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] m = new int[500];
		int[] j = new int[500];
		int i = 0;
		int n;
		int e;
		int v = 0;
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
			if (m[i] % 2 != 0)
			{
				j[v] = m[i];
				v = v + 1;
			}
		}
		for (int k = 0;k < v - 1;k++)
		{
			for (int q = 0;q < v - k - 1;q++)
			{
				if (j[q] > j[q + 1])
				{
					e = j[q + 1];
					j[q + 1] = j[q];
					j[q] = e;
				}
			}
		}
		for (int u = 0;u < v - 1;u++)
		{
		System.out.printf("%d,", j[u]);
		}
		System.out.printf("%d", j[v - 1]);
		return 0;
	}
}

