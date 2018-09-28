package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[101];
		int[] b = new int[101];
		int[] c = new int[101];
		int n;
		int i;
		int e = 1;
		int f = 0;
		int g;
		int h;
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
				a[i] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				b[i] = Integer.parseInt(tempVar3);
			}
		}
		for (i = 1;i <= 101;i++)
		{
			c[i] = 0;
		}
		for (i = 1;i <= n;i++)
		{
			if (a[i] >= 90 && a[i] <= 140 && b[i] >= 60 && b[i] <= 90)
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

