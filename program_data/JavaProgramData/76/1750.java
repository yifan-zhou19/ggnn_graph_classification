package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int n;
		int x = 10000;
		int y = 0;
		int s = 0;
		int o;
		int[] a = new int[MAX];
		int[] b = new int[MAX];
		double k;
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
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				b[i] = Integer.parseInt(tempVar3);
			}
		}

		for (i = 1;i <= n;i++)
		{
			if (a[i] <= x)
			{
				x = a[i];
			}
			if (b[i] >= y)
			{
				y = b[i];
			}
		}
		for (k = x + 0.1;k < y;k++)
		{
			o = 0;
			for (i = 1;i <= n;i++)
			{
				if ((k > a[i]) && (k < b[i]))
				{
					o++;
				}
			}
			if (o == 0)
			{
				s++;
			}
		}
		if (s == 0)
		{
			System.out.printf("%d %d",x,y);
		}
		else
		{
			System.out.print("no");
		}
		return 0;
	}
}

