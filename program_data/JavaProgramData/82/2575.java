package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] a = new int[100];
		int[] b = new int[100];
		int[] c = new int[100];
		int i;
		int k;
		int d = 0;
		int e = 0;
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
				(a[i]) = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				(b[i]) = Integer.parseInt(tempVar3);
			}
		}
		for (i = 0;i < n - 1;i++)
		{
			if ((a[i] >= 90 && a[i] <= 140) && (b[i] >= 60 && b[i] <= 90))
			{
				d++;
			}
			else
			{
				c[e] = d;
				e++;
				d = 0;
			}
		}
		if ((a[n - 1] >= 90 && a[n - 1] <= 140) && (b[n - 1] >= 60 && b[n - 1] <= 90))
		{
			d++;
			c[e] = d;
			e++;
		}
		else
		{
			c[e] = d;
			e++;
		}
		for (i = 1;i <= e;i++)
		{
			for (k = 0;k < e - i;k++)
			{
				if (c[k] < c[k + 1])
				{
					d = c[k + 1];
					c[k + 1] = c[k];
					c[k] = d;
				}
			}
		}
		System.out.printf("%d",c[0]);
		return 0;
	}


}

