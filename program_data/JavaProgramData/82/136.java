package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[100];
		int[] b = new int[100];
		int n;
		int[] c = new int[100];
		int i;
		int x = 0;
		int y = 0;
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
				a[i] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				b[i] = Integer.parseInt(tempVar3);
			}
		}
		for (i = 0;i < n;i++)
		{
			if (a[i] >= 90 && a[i] <= 140 && b[i] >= 60 && b[i] <= 90)
			{
				x++;
			}
			else
			{
				c[y] = x;
				y++;
				x = 0;
			}
		}
		c[y] = x;
		int e;
		int k;
		for (k = 1;k <= y + 1;k++)
		{
			for (i = 0;i < y + 1 - k;i++)
			{
				if (c[i] < c[i + 1])
				{
					e = c[i + 1];
					c[i + 1] = c[i];
					c[i] = e;
				}
			}
		}
		System.out.printf("%d\n",c[0]);
		return 0;
	}
}

