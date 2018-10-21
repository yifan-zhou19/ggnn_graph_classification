package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int[] z = new int[100];
		int max = 0;
		int[] x = new int[100];
		int[] y = new int[100];
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i <= n - 1;i++)
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
		}
		i = -1;
		for (j = 0;;j++)
		{
			for (i = i + 1;i <= n - 1;i++)
			{
				if (x[i] >= 90 && x[i] <= 140 && y[i] >= 60 && y[i] <= 90)
				{
				z[j] = z[j] + 1;
				}
			else
			{
				break;
			}
			}
		if (z[j] > max)
		{
			max = z[j];
		}
		if (i >= n)
		{
			break;
		}
		}
		System.out.printf("%d",max);
		return 0;

	}
}

