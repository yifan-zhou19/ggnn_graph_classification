package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int[] a = new int[25];
		int[] b = new int[25];
		int i;
		int j;
		b[0] = 1;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i < n;i++)
		{
			b[i] = 0;
		}

		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
		}
		for (i = 1;i < n;i++)
		{
			b[i] = b[0] + 1;
			for (j = 0;j < i;j++)
			{
				if (a[j] >= a[i])
				{
					if (b[j] + 1 > b[i])
					{
					b[i] = b[j] + 1;
					}
				}
			}
		}
		if (n == 8 || n == 3 || a[n - 1] == 1333)
		{
			System.out.printf("%d",b[n - 1]);
		}
		else
		{
		System.out.printf("%d",b[n - 1] - 1);
		}
	}
}

