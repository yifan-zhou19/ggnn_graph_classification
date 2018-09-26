package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int u;
		u = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[] x = new int[1000];
		int[] y = new int[1000];
		int[] t = new int[100];
		for (int i = 0;i < 100;i++)
		{
			t[i] = 0;
		}
		for (int i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				x[i] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				y[i] = Integer.parseInt(tempVar3);
			}
			if (x[i] >= 90 && x[i] <= 140 && y[i] >= 60 && y[i] <= 90)
			{
				t[u]++;
			}
			else
			{
				u = u + 1;
			}
		}
		int max;
		max = 0;
		for (int i = 0;i < 100;i++)
		{
			if (max <= t[i])
			{
				max = t[i];
			}
		}
		System.out.printf("%d",max);
		return 0;
	}

}

