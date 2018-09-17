package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[] a = new int[25];
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			a[0] = Integer.parseInt(tempVar2);
		}
		int i = 1;
		while (i < n)
		{
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				a[i] = Integer.parseInt(tempVar3);
			}
			i++;
		}
		int[] b = new int[25];
		i = n - 2;
		b[n - 1] = 1;
		while (i >= 0)
		{
			b[i] = 1;
			int m = i + 1;
			while (m < n)
			{
				if ((a[m] <= a[i]) && (b[m] >= b[i] - 1))
				{
					b[i] = b[m] + 1;
				}
				m++;
			}
			i--;
		}
		int k = 1;
		i = 0;
		while (i < n)
		{
			if (b[i] > k)
			{
				k = b[i];
			}
			i++;
		}
		System.out.printf("%d",k);
		return 0;
	}
}

