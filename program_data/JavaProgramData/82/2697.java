package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[100];
		int[] b = new int[100];
		int[] c = new int[100];
		int n;
		int i;
		int m = 0;
		int k;
		for (i = 0;i < 100;i++)
		{
			c[i] = 0;
		}
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
			if ((a[i] >= 90 && a[i] <= 140) && (b[i] >= 60 && b[i] <= 90))
			{
				c[m]++;
			}
			else
			{
				m++;
			}
		}
		for (k = 0;k < m;k++)
		{
			for (i = 0;i < m - k;i++)
			{
				int d;
				if (c[i] > c[i + 1])
				{
					d = c[i + 1];
					c[i + 1] = c[i];
					c[i] = d;
				}
			}
		}
		System.out.printf("%d",c[m]);
		return 0;
	}


}

