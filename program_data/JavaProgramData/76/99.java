package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int ai = 0;
		int bi = 0;
		int i;
		int j;
		int[][] a = new int[2][50000];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[1][i] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				a[0][i] = Integer.parseInt(tempVar3);
			}
		}
		for (i = n - 1;i > 0;i--)
		{
			for (j = 0;j < i;j++)
			{
				if (a[1][j] > a[1][i])
				{
					ai = a[1][j];
					bi = a[0][j];
					a[1][j] = a[1][i];
					a[0][j] = a[0][i];
					a[1][i] = ai;
					a[0][i] = bi;
				}
			}
		}
		ai = a[1][0];
		bi = a[0][0];
		for (i = 0;i < n - 1;i++)
		{
			if (a[1][i + 1] > bi)
			{
				System.out.print("no");
				return 0;
			}
			else
			{
				if (a[0][i + 1] > bi)
				{
				bi = a[0][i + 1];
				}
			}

		}
		System.out.printf("%d %d",ai,bi);
		return 0;
	}
}

