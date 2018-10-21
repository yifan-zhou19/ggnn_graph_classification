package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int bianyuan = 0;
		int n;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			System.out.printf("%d\n",bianyuan());
		}

	}

	public static int bianyuan()
	{
		int[] c = new int[10000];
		int m;
		int n;
		int i;
		int j;
		int t;
		int sum = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		t = m * n;
		int[] p = c;
		for (i = 0;i < t;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				p + i = tempVar3;
			}
		}
		if (t == 1)
		{
			return p[0];
		}
		for (i = 0;i < n - 1;i++)
		{
			sum += p[i];
		}
		for (i = 1;i < m;i++)
		{
			sum += p[i * n] + p[i * n - 1];
		}
		for (i = 1;i < n;i++)
		{
			sum += p[(m - 1) * n + i];
		}
		return sum;
	}



}

