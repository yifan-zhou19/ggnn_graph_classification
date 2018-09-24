package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[] shu = new int[300];
		int i;
		double a = 0.0;
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				shu[i] = Integer.parseInt(tempVar2);
			}
			a = a + (double)shu[i] / n;
		}
		int j;
		int t;
		for (i = 0;i < n;i++)
		{
			for (j = n - 1;j > i;j--)
			{
				if (shu[j] < shu[j - 1])
				{
					t = shu[j - 1];
					shu[j - 1] = shu[j];
					shu[j] = t;
				}
			}
		}
		if (a - shu[0] > shu[n - 1] - a)
		{
			System.out.printf("%d",shu[0]);
		}
		else if (a - shu[0] < shu[n - 1] - a)
		{
			System.out.printf("%d",shu[n - 1]);
		}
		else
		{
			System.out.printf("%d,%d\n",shu[0],shu[n - 1]);
		}
		return 0;
	}

}

