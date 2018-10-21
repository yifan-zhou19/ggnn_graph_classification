package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int[] a = new int[300];
		int[] b = new int[300];
		int m = 0;
		int j;
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
			for (j = i + 1;j < n;j++)
			{
				if (a[i] == a[j])
				{
					b[j] = 1;
				}
			}
		}
		for (i = n - 1;i >= 0;i--)
		{
			if (b[i] == 0)
			{
				break;
			}
			else
			{
				m = m + 1;
			}
		}
		for (i = 0;i < n - m - 1;i++)
		{
			if (b[i] == 0)
			{
				System.out.printf("%d,",a[i]);
			}
		}
		System.out.printf("%d",a[n - m - 1]);
	}
}

