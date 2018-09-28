package <missing>;

public class GlobalMembers
{
	public static void pro()
	{
		int i;
		int[] a = new int[21];
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i < n + 1;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
		}
		if (a[n] + 3 * n < 60)
		{
			System.out.printf("%d\n",60 - 3 * n);
		}
		else if (a[n] + 3 * n < 64)
		{
			System.out.printf("%d\n",a[n]);
		}
		else
		{
			for (i = 1;i < n + 1;i++)
			{
				if (a[i] + 3 * i > 64)
				{
					System.out.printf("%d\n",63 - 3 * i);
					break;
				}
				else if (a[i] + 3 * i > 59)
				{
					System.out.printf("%d\n",a[i]);
					break;
				}
			}
		}

	}
	public static void Main()
	{
		int n;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			pro();
		}
	}

}

