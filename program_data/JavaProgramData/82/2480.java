package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int[][] a = new int[100][2];
		int[] b = new int[100];
		int[] k = new int[100];
		int max = 0;
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
				a[i][1] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a[i][2] = Integer.parseInt(tempVar3);
			}
		}
		for (i = 1;i <= n;i++)
		{
			if (a[i][1] <= 140 && a[i][1] >= 90 && a[i][2] <= 90 && a[i][2] >= 60)
			{
				b[i] = 1;
			}
			else
			{
				b[i] = 0;
			}
		}
		j = 1;
		for (i = 1;i < n;i++)
		{
			if (b[i] == 1)
			{
				k[j] += 1;
				if (i == (n - 1) && b[n] == 1)
				{
					k[j] += 1;
				}
			}
			if (b[i] == 0)
			{
				j++;
			}
		}
		for (j = 1;j <= 100;j++)
		{
			if (k[j] >= max)
			{
				max = k[j];
			}
		}
		if (n == 1)
		{
			if (b[1] == 1)
			{
				System.out.print("1");
			}
			else
			{
				System.out.print("0");
			}
		}
		else
		{
		System.out.printf("%d",max);
		}
		return 0;
	}
}

