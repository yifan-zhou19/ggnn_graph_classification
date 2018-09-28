package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int[] a = new int[300];
		int[] b = new int[300];
		int x = 0;
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
			if (a[i] != 0)
			{
				for (j = i + 1;j < n;j++)
				{
					if (a[i] == a[j])
					{
						a[j] = 0;
					}
				}
			}
		}
		for (i = 0;i < n;i++)
		{
			if (a[i] != 0)
			{
				b[x] = a[i];
				x++;
			}
		}
		for (i = 0;i < x;i++)
		{
			if (i == x - 1)
			{
			System.out.printf("%d",b[i]);
			}
			if (i != x - 1)
			{
				System.out.printf("%d,",b[i]);
			}
		}
		return 0;
	}

}

