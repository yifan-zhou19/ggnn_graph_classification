package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] a = new int[100];
		int[] b = new int[100];
		int i;
		int c;
		int[] d = new int[100];
		int m;
		for (i = 0;i < 100;i++)
		{
			d[i] = 0;
		}
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		c = 0;
		for (i = 0;i < n;i++)
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
		for (i = 0;i < n;i++)
		{
			if (a[i] >= 90 && a[i] <= 140 && b[i] >= 60 && b[i] <= 90)
			{
				c = c + 1;
				d[i] = c;
			}
			else
			{
				d[i] = c;
				c = 0;
			}
		}
		m = 0;
		for (i = 0;i < 99;i++)
		{
			if (d[i] > m)
			{
				m = d[i];
			}
		}
		System.out.printf("%d",m);
		return 0;
	}

}

