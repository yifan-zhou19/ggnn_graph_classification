package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int t;
		int r;
		int i;
		int j;
		int s;
		int k;
		int n;
		int[][] a = new int[10][10];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < n;j++)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					a[i][j] = Integer.parseInt(tempVar2);
				}
			}
		}
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < n;j++)

			{
				if (a[i][j] == 0)
				{
						k = i;
			t = 0,r = 0;

		while (a[i][j] != 255)
		{
			i++;
			t++;
		}
		i = k;
		while (a[i][j] != 255)
		{
			j++;
			r++;
		}
		i = n + 1;
		j = n + 1;
				}

			}
		}
		s = (r - 2) * (t - 2);
		System.out.printf("%d",s);
		return 0;
	}

}

