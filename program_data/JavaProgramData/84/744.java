package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int m;
		int[] x = new int[100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < 100;i++)
		{
			if (i == n)
			{
				break;
			}
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				x[i] = Integer.parseInt(tempVar2);
			}
		}
		for (i = 0;i < n - 1;i++)
		{
			if (x[i] > x[i + 1])
			{
				m = x[i];
				x[i] = x[i + 1];
				x[i + 1] = m;
			}
		}
		for (i = 0;i < n - 2;i++)
		{
			if (x[i] > x[i + 1])
			{
				m = x[i];
				x[i] = x[i + 1];
				x[i + 1] = m;
			}
		}
		System.out.printf("%d\n%d\n",x[n - 1],x[n - 2]);
		return 0;
	}
}

