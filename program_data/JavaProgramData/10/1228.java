package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int k;
		int[] a = new int[25];
		int[] b = new int[25];
		int m;
		int i;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}
		for (i = 0;i <= k - 1;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
		}
		for (i = k - 1;i >= 0;i--)
		{
			m = 0;
			for (j = i;j <= k - 1;j++)
			{
				if (a[i] >= a[j] != 0 && m <= b[j])
				{
					m = b[j];
				}
			}
			b[i] = m + 1;
		}
		m = b[0];
		for (i = 0;i <= k - 1;i++)
		{
			if (m < b[i])
			{
				m = b[i];
			}
		}
		System.out.printf("%d",m);
	}

}

