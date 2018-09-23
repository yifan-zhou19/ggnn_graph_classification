package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int b;
		int c;
		int d;
		int e = -1;
		int f = -1;
		int[] m = new int[1000];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (int k = 1;k <= n;k++)
		{
		for (int i = 1;i <= n;i++)
		{
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			m[i] = Integer.parseInt(tempVar2);
		}

		if (e > 0 && f > 0 && m[i] == 0)
		{
			d = k;
			c = i;

		}
		if (e < 0 && f < 0 && m[i] == 0)
		{
			e = k;
			f = i;
		}
		}
		}
		b = (c - f + 1) * (d - e+1) - 2 * (c - f + 1) - 2 * (d - e-1);
		System.out.printf("%d",b);
		return 0;
	}
}

