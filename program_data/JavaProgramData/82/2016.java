package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int c = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[][] SZ = new int[n][2];
		int[] a = new int[1000];
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < 2;j++)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					SZ[i][j] = Integer.parseInt(tempVar2);
				}
			}
		}
		for (i = 0;i < n;i++)
		{
			if (SZ[i][0] >= 90 && SZ[i][0] <= 140 && SZ[i][1] >= 60 && SZ[i][1] <= 90)
			{
				a[c] = a[c] + 1;
			}
			else
			{
				c = c + 1;
			}
		}
		int tmp = 0;
		for (i = 0;i < n;i++)
		{
			for (j = n - 1;j > i;j--)
			{
				if (a[i] > a[j])
				{
					tmp = a[j];
					a[j] = a[i];
					a[i] = tmp;
				}
			}
		}
		System.out.printf("%d",a[n - 1]);
		return 0;
	}










}

