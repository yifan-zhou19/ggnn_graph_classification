package <missing>;

public class GlobalMembers
{
	public static int[][] a = new int[1000][1000];
	public static int Main()
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int p;
		int q;
		for (p = 0;p < n;p++)
		{
			for (q = 0;q < n;q++)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					(a[p][q]) = Integer.parseInt(tempVar2);
				}
			}
		}
		int p1 = 0;
		int p2 = 0;
		int q1;
		int q2;
		for (p = 0;p < n;p++)
		{
			for (q = 0;q < n;q++)
			{
				if (a[p][q] == 0)
				{
					p1 = p;
					q1 = q;
					break;

				}
				if (p1 != 0)
				{
				break;
				}

			}
			if (p1 != 0)
			{
				break;
			}
		}
		for (p = n - 1;p >= 0;p--)
		{
			for (q = n - 1;q >= 0;q--)
			{
				if (a[p][q] == 0)
				{
					p2 = p;
					q2 = q;
					break;

				}
				if (p2 != 0)
				{
					break;
				}

			}
			if (p2 != 0)
			{
					break;
			}
		}
		int x;
		x = (p2 - p1 - 1) * (q2 - q1 - 1);
		System.out.printf("%d",x);
		return 0;
	}
}

