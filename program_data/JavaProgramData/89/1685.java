package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] a = new int[100000];
		int[] b = new int[100000];
		int i = 0;
		int t = 0;
		int j;
		int x = 0;
		int y = 0;
		int w = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		while (scanf("%d %d", a[i], b[i]) != EOF && !(a[i] == 0 && b[i] == 0))
		{
		i++;
		}
		t = i - 1;
		for (i = 0;i < n;i++)
		{
			if (w == 0)
			{
			for (j = 0;j <= t;j++)
			{
				if (i == a[j])
				{
					x++;
				}
			}
			if (x == 0)
			{
				for (j = 0;j <= t;j++)
				{
					if (b[j] == i)
					{
						y++;
					}
				}
				if (y == n - 1)
				{
					System.out.printf("%d\n",i);
					w++;
				}
			}
			}
			x = 0;
			y = 0;
		}
		if (w == 0)
		{
			System.out.print("NOT FOUND\n");
		}
		return 0;
	}








}

