package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] a = new int[50000];
		int[] b = new int[50000];
		int[] c = new int[50000];
		int[] d = new int[50000];
		int max;
		int min;
		int i;
		int j;
		double k;
		int e;
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
			c[i] = a[i];
			d[i] = b[i];
		}

		for (i = 0;i < (n - 1);i++)
		{
			if (a[i] < a[i - 1])
			{
				e = a[i];
				a[i] = a[i + 1];
				a[i + 1] = e;
			}

		}
		min = a[n - 1];
		for (i = 0;i < (n - 1);i++)
		{
			if (b[i] > b[i + 1])
			{
				e = b[i];
				b[i] = b[i + 1];
				b[i + 1] = e;
			}
		}
		max = b[n - 1];

		for (k = min + 0.1;k <= max;k++)
		{
			for (j = 0;j < n;j++)
			{
				if (k >= c[j] != 0 && k <= d[j])
				{
				break;
				}
				else
				{
				   if (j == n - 1)
				   {
					   System.out.print("no");
					   return 0;
				   }
				   else
				   {
					   continue;
				   }
				}
			}

		}
		System.out.printf("%d %d",min,max);
		return 0;
	}

}

