package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int x;
		int y;
		int i;
		int t;
		int total;
		int max;
		int[] a = new int[100];
		int[] b = new int[100];
		int[] c = new int[100];
		for (i = 0;i <= 99;i++)
		{
			a[i] = 0;
			b[i] = 0;
			c[i] = 0;
		}

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0,t = 0;i <= n - 1;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				x = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				y = Integer.parseInt(tempVar3);
			}
			if (x >= 90 && x <= 140 && y >= 60 && y <= 90)
			{
				a[t] = a[t] + 1;
			}
			else
			{
			t = t + 1;
			}
		}
	max = a[0];
		for (i = 0;i <= 98;i++)
		{
			if (max > a[i + 1])
			{
				total = max;
			}
			else
			{
				max = a[i + 1];
				 total = max;
			}
		}
	System.out.printf("%d\n",total);


		return 0;
	}
}

