package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[101];
		int[] b = new int[101];
		int[] c = new int[101];
		int n;
		int d;
		int e;
		int f;
		int g;
		int h;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		f = 0;
		e = 1;
		for (d = 1;d <= n;d++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[d] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				b[d] = Integer.parseInt(tempVar3);
			}
		}
		for (d = 1;d <= 101;d++)
		{
			c[d] = 0;
		}
		for (d = 1;d <= n;d++)
		{
			if (a[d] >= 90 && a[d] <= 140 && b[d] >= 60 && b[d] <= 90)
			{
				f++;
				c[e] = f;
			}
			else
			{
					e++;
					f = 0;

			}
		}
			for (g = e-1;g >= 1;g--)
			{
				if (c[g] < c[g + 1])
				{
					h = c[g + 1];
					c[g] = h;
				}
			}
			System.out.printf("%d\n",c[1]);
			return 0;

	}
}

