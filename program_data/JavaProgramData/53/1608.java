package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] a = new int[300];
		int i = 0;
		int t = 0;
		int p = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i <= n - 1;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}

		}
		for (i = 0;i <= n - 1;i++)
		{
		for (t = 0;t <= i - 1;t++)
		{
				if (a[i] == a[t])
				{
					p++;
				}
		}

		if (p != 0)
		{
				a[i] = 0;
		}
		p = 0;
		}
		for (i = 0;i <= n - 1;i++)
		{
			if (a[i] != 0)
			{
				System.out.printf("%d",a[i]);
			break;
			}
		}
		for (t = i + 1;t <= n - 1;t++)
		{
			if (a[t] != 0)
			{
				System.out.printf(",%d",a[t]);
			}
		}
	}
}

