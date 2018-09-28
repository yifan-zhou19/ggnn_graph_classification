package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int[] a = new int[100];
		int d;
		int k = 0;
		int[] b = new int[100];
		int[] c = new int[100];
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
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				b[i] = Integer.parseInt(tempVar3);
			}
		}
		for (i = 0;i < n;i++)
		{
			if ((a[i] >= 90) && (a[i] <= 140) && (b[i] >= 60) && (b[i] <= 90))
			{
				c[k]++;
			}
			else
			{
				k++;
			}
		}
		if ((a[n - 1] >= 90) && (a[n - 1] <= 140) && (b[n - 1] >= 60) && (b[n - 1] <= 90))
		{
			k++;
		}
		for (i = 0;i < k - 1;i++)
		{
			if (c[i] > c[i + 1])
			{
				d = c[i + 1];
				c[i + 1] = c[i];
				c[i] = d;
			}
		}
		System.out.printf("%d",c[k - 1]);
		return 0;
	}
}

