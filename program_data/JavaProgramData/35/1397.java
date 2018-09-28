package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[8][8];
		int h;
		int l;
		int j;
		int i;
		int[] hm = new int[8];
		int[] lm = new int[8];
		int s = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			h = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(",");
		if (tempVar2 != null)
		{
			l = Integer.parseInt(tempVar2);
		}

		for (i = 0;i <= h - 1;i++)
		{
			for (j = 0;j <= l - 1;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					a[i][j] = Integer.parseInt(tempVar3);
				}
			}
		}
		for (i = 0;i <= 7;i++)
		{
			hm[i] = 0;
			lm[i] = a[0][i];
		}
		for (i = 0;i <= h - 1;i++)
		{
			for (j = 0;j <= l - 1;j++)
			{
				if (hm[i] < a[i][j])
				{
					hm[i] = a[i][j];
				}
			}
		}
		for (i = 0;i <= l - 1;i++)
		{
			for (j = 0;j <= h - 1;j++)
			{
				if (lm[i] > a[j][i])
				{
					lm[i] = a[j][i];
				}
			}
		}
		for (i = 0;i <= h - 1;i++)
		{
			for (j = 0;j <= l - 1;j++)
			{
				if (a[i][j] == hm[i] && a[i][j] == lm[j])
				{
					System.out.printf("%d+%d",i,j);
					s += 1;
				}
			}
		}
		if (s == 0)
		{
			System.out.print("No");
		}
		return 0;
	}

}

