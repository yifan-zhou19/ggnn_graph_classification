package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int m;
		int i;
		int[] a = new int[50];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			m = Integer.parseInt(tempVar2);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a[i] = Integer.parseInt(tempVar3);
			}
		}
		for (i = n - 1;i >= m;i--)
		{
			a[i] = a[i] * 100 + a[i - m];
		}
		if (m == n / 2 + 1)
		{
			a[0] = a[n - m];
		}
		else
		{
			a[0] = a[0] * 100 + a[n - m] / 100;
		}
		for (i = 1;i < m;i++)
		{
			a[i] = a[i] * 100 + a[n - m + i] / 100;
		}
		for (i = 0;i < n;i++)
		{
			System.out.printf("%d",a[i] % 100);
			if (i != n - 1)
			{
				System.out.print(" ");
			}
		}
	}


}

