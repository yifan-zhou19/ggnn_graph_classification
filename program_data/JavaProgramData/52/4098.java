package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int m;
		int[] a = new int[100];
		int i;
		int mid;
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
		if (n == 2 * m) //???????????????????????
		{
		for (i = 0;i < m;i++)
		{
			mid = a[n - m + i]; //????m?????????????
			a[n - m + i] = a[i];
			a[i] = mid;
		}
		}
		if (n > 2 * m) //??????m?????????????????????
		{
		for (i = 0;i < m;i++)
		{
			mid = a[n - m + i];
			a[n - m + i] = a[i];
			a[i] = mid;
		}
		for (int j = m;j > 0;j--)
		{
			for (i = j;n - i > m + m - j;i++)
			{
			mid = a[n - i];
			a[n - i] = a[n - i - 1];
			a[n - i - 1] = mid;
			}
		}
		}
		if (n < m + m)
		{
			for (int j = m;j > 0;j--) //???m?????????????????????????????????
			{
			for (i = n - j;i > m - j;i--)
			{
				mid = a[i];
			a[i] = a[i - 1];
			a[i - 1] = mid;
			}
			}
		}
		for (i = 0;i < n - 1;i++)
		{
			System.out.printf("%d ",a[i]);
		}
		System.out.printf("%d",a[n - 1]);
	}

}

