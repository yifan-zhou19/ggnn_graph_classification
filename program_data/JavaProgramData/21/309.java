package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int[] a = new int[300];
		int[] b = new int[300];
		int i;
		int s = 0;
		int k = 0;
		int j;
		int t;
		double x;
		double y;
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
		}
		for (i = 0;i < n;i++)
		{
			s = s + a[i];
		}
		x = (double)s / (double)n;
		y = Math.abs(a[0] - x);
		for (i = 1;i < n;i++)
		{
			if (Math.abs(a[i] - x) > y)
			{
				y = Math.abs(a[i] - x);
			}
		}
		for (i = 0;i < n;i++)
		{
			if (Math.abs(a[i] - x) == y)
			{
				b[k] = a[i];
				k++;
			}
		}
		if (k == 1)
		{
			System.out.printf("%d",b[0]);
		}
		else if (k == 2)
		{
			if (b[0] > b[1])
			{
				System.out.printf("%d,%d",b[1],b[0]);
			}
			else
			{
				System.out.printf("%d,%d",b[0],b[1]);
			}
		}
		else
		{
			for (j = 0;j < k - 1;j++)
			{
				for (i = 0;i < k - 1 - j;i++)
				{
					if (b[i] > b[i + 1])
					{
						t = b[i];
						b[i] = b[i + 1];
						b[i + 1] = t;
					}
				}
			}
			System.out.printf("%d",b[0]);
			for (i = 1;i < k;i++)
			{
				System.out.printf(",%d",b[i]);
			}
		}
	}
}

