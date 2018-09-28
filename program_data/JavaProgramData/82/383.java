package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int n;
		int[] x = new int[100];
		int[] y = new int[100];
		int[] z = new int[100];
		int s = 0;
		int t = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
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
			if (x[i] <= 140 && x[i] >= 90 && y[i] <= 90 && y[i] >= 60)
			{
				z[i] = 1;

			}
			else
			{
				z[i] = 0;
			}
		}
		for (i = 1;i <= n;i++)
		{
			if (z[i] == 1)
			{
				s = s + 1;
			}
			if (z[i] == 0 || i == n)
			{
				if (s > t)
				{
					t = s;
				}
				s = 0;
			}
		}

	System.out.printf("%d",t);
		return 0;
	}

}

