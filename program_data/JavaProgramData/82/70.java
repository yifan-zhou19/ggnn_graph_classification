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
		int[][] a = new int[100][2];
		int[] ci = new int[100];
		int m = 0;
		int i;
		int j;
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < 2;j++)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					a[i][j] = Integer.parseInt(tempVar2);
				}
			}
			if (a[i][0] >= 90 && a[i][0] <= 140 && a[i][1] >= 60 && a[i][1] <= 90)
			{
				ci[m]++;
			}
			else
			{
				m++;
			}
		}
		int max = ci[0];
		for (i = 0;i < m + 1;i++)
		{
			if (ci[i] > max)
			{
				int e;
				e = ci[i];
				ci[i] = max;
				max = e;
			}
		}

		System.out.printf("%d",max);


		return 0;
	}

}

